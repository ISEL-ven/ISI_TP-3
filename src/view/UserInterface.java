// https://ascii.co.uk/text

package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserInterface {
    public UserInterface(boolean banner) {
        if (banner) showBanner();
        showMenu();
        showInsertsMenu();
    }
    private void showBanner() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/view/banner.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // show root menu
    private void showMenu() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/view/rootMenu.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // 1 - branch INSERCOES
    private void showInsertsMenu() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/view/Inserir.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // 2 - branch UPDATES
    // 3 - branch SIMPLE QUERIES
    // 4 - branch COMPLEX QUERIES
    // 5 - EXIT









    // explicar como funciona o programa

    // 1. Inserir novo condutor

    // 2. Colocar um veículo fora de serviço passando para a tabela VEICULO.OLD

    // 3. Escolher veiculo de tabela e calcular horas totais, kilómetros e custo total

    // 4. Apresentar a lista dos clientes (id, nome, nif) com mais viagens em 2021 (2c do trab 2)

    // 5. Apresentar condutores que nunca fizeram viagens (2d do trab 2)

    // 6. Apresentar o número de viagens efetuadas pela viatura de um proprietário dado o seu NIF (3b do trab 2)

    // 7. Dada a indicação do ano , apresentar os dados do condutor cujo total de viagens nesse ano teve o maior
    // custo acumulado. O resultado deve apresentar o nome, número de identificação e morada.

    // 8. Permitir alterar ou criar tipo veículo,

    // INSERÇÂO DE DADOS -----------------------------------------------------------------------------------------------

    // CONSULTA DE TOTAIS ----------------------------------------------------------------------------------------------
    //select * from ,select count(*) from, etc
}
