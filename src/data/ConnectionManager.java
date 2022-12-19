package data;

import java.sql.*;

public class ConnectionManager {
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost:5432/myDataBase";  // TODO
    private String username = "username";  // TODO
    private String password = "password";  // TODO
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public void ConnectionManager(){}

    public Boolean initConnection() {
        try {
            Class.forName(driver);
            this.conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean closeConnection() {
        try {
            this.conn.close();
            this.conn = null;
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean createStatement() {
        if (this.conn != null) {
            try {
                this.stmt = this.conn.createStatement();
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public Boolean closeStatement() {
        if (this.conn != null && this.stmt != null) {
            try {
                this.stmt.close();
                this.stmt = null;
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public Boolean executeQuery(String query) {
        if (this.conn != null && this.stmt != null) {
            try {
                this.rs = this.stmt.executeQuery(query);
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public Boolean closeResultSet() {
        if (this.conn != null && this.stmt != null && this.rs != null) {
            try {
                this.rs.close();
                this.rs = null;
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public ResultSet getNextResult() {
        if (this.conn != null && this.stmt != null && this.rs != null) {
            try {
                this.rs.next();
                // TODO: process the result
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return null;  // TODO
    }
}
