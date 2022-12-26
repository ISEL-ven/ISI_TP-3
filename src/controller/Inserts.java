package controller;

import controller.datamodel.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;


public class Inserts {
    private Scanner in;

    public Inserts(Scanner in) {
        this.in = in;
    }

    public void insertDriver() { // idPessoa, nCConducao
        Pessoa pessoa = new Pessoa();
        pessoa.setAtrdisc("C");
        Condutor condutor = new Condutor();
        Contacto contacto = new Contacto();

        String nomeProprio, apelido, dtnascimento, morada, codpostal, localidade, telefone, noident, nif, nCConducao;
        LocalDate birth;
        int idPessoa;
        String[] idviatura;

        System.out.println(" INSERIR CONDUTOR");

        // Dados pessoa ---------------------------------------------------------------
        System.out.print(" Nome próprio: ");
        nomeProprio = in.nextLine();
        pessoa.setNproprio(nomeProprio);

        System.out.print(" Apelido: ");
        apelido = in.nextLine();
        pessoa.setApelido(apelido);

        System.out.print(" Data de Nascimento (AAAA-MM-DD): ");
        dtnascimento = in.nextLine();
        // TODO: verificar data
        birth = LocalDate.parse(dtnascimento);
        // dtnascimento é para a tabela condutor

        System.out.print(" Morada: ");
        morada = in.nextLine();
        pessoa.setMorada(morada);

        System.out.print(" Código postal: ");
        codpostal = in.nextLine();
        // TODO: verificar se parssa para INTEGER
        int cp = Integer.parseInt(codpostal);
        pessoa.setCodpostal(cp);

        System.out.print(" Localidade: ");
        localidade = in.nextLine();
        pessoa.setLocalidade(localidade);

        System.out.print(" Contacto (incluir indicativo): ");
        telefone = in.nextLine();
        // para a tabela contacto

        System.out.print(" Número de identidade: ");
        noident = in.nextLine();
        pessoa.setNoident(noident);

        System.out.print(" NIF: ");
        nif = in.nextLine();
        pessoa.setNif(nif);

        System.out.print(" Número de carta de Condução: ");
        nCConducao = in.nextLine();
        // Para a tabela cobndutor

        // TODO: inserir pessoa e e buscar o ID desta
        contacto.setIdpessoa(idPessoa);
        contacto.setNtelefone(telefone);
        // TODO: inserir contacto

        condutor.setIdpessoa(idPessoa);
        condutor.setDtnascimento(birth);
        condutor.setNconducao(nCConducao);
        // TODO: inserir condutor

        // Viaturas que pode conduzir -----------------------------
        // TODO: Listar viaturas (ID, matricula, marca, modelo)
        System.out.println(" Identifique, separados por virgulas, os IDs das viaturas que este condutor pode conduzir: ");
        String viats = in.nextLine();
        idviatura = viats.split(",");
        idviatura = Arrays.stream(idviatura).map(String::trim).toArray(String[]::new);  // remove white spaces
        // TODO: inserir dados em condutor habilitado

        System.out.println(" Condutor inserido com sucesso");
    }


    public void insertDriverSchedule() {
        PeriodoActivo pa = new PeriodoActivo();
        int idVeiculo, idCondutor;
        LocalDateTime now = LocalDateTime.now();

        System.out.println(" PERIODO ACTIVO");
        // TODO: mostrar condutores
        System.out.println(" Escolha o condutor: ");
        String condutorStr = in.nextLine();
        int condutor = Integer.parseInt(condutorStr);
        pa.setCondutor(condutor);

        // TODO: mostrar as viaturas que este condutor pode conduzir
        System.out.println(" Escolha a viatura: ");
        String viaturaStr = in.nextLine();
        int viatura = Integer.parseInt(viaturaStr);
        pa.setVeiculo(viatura);

        System.out.println(" Data/Hora de início (AAAA-MM-DD hh:mm:ss): ");
        String dtinicioStr = in.nextLine();
        LocalDateTime dtinicio = LocalDateTime.parse(dtinicioStr);
        pa.setDtinicio(dtinicio);

        System.out.println(" Data/Hora do final (AAAA-MM-DD hh:mm:ss: ");
        String dtfimStr = in.nextLine();
        LocalDateTime dtfim = LocalDateTime.parse(dtfimStr);
        pa.setDtfim(dtfim);

        System.out.println(" Latitude: ");
        String latStr = in.nextLine();
        BigDecimal lat = BigDecimal.valueOf(Long.parseLong(latStr));
        // TODO: verificar se entre -90 e 90
        pa.setLat(lat);

        System.out.println(" Longitude: ");
        String lonStr = in.nextLine();
        BigDecimal lon = BigDecimal.valueOf(Long.parseLong(lonStr));
        // TODO: verificar se entre -180 e 180
        pa.setLon(lon);

        System.out.println(" Período adicionado com sucesso");
        // TODO voltar ao menu anterior
    }

    public void insertClient() {
        Pessoa pessoa = new Pessoa();
        pessoa.setAtrdisc("CL");
        Contacto contacto = new Contacto();

        String nomeProprio, apelido, morada, codpostal, localidade, telefone, noident, nif;
        int idPessoa;

        System.out.println(" INSERIR CLIENTE");

        // Dados pessoa ---------------------------------------------------------------
        System.out.print(" Nome próprio: ");
        nomeProprio = in.nextLine();
        pessoa.setNproprio(nomeProprio);

        System.out.print(" Apelido: ");
        apelido = in.nextLine();
        pessoa.setApelido(apelido);

        System.out.print(" Morada: ");
        morada = in.nextLine();
        pessoa.setMorada(morada);

        System.out.print(" Código postal: ");
        codpostal = in.nextLine();
        // TODO: verificar se parssa para INTEGER
        int cp = Integer.parseInt(codpostal);
        pessoa.setCodpostal(cp);

        System.out.print(" Localidade: ");
        localidade = in.nextLine();
        pessoa.setLocalidade(localidade);

        System.out.print(" Contacto (incluir indicativo): ");
        telefone = in.nextLine();
        // para a tabela contacto

        System.out.print(" Número de identidade: ");
        noident = in.nextLine();
        pessoa.setNoident(noident);

        System.out.print(" NIF: ");
        nif = in.nextLine();
        pessoa.setNif(nif);

        // TODO: inserir pessoa e e buscar o ID desta
        contacto.setIdpessoa(idPessoa);
        contacto.setNtelefone(telefone);
        // TODO: inserir contacto

        System.out.println(" Cliente inserido com sucesso");
    }

    public void insertCarOwner() {
    }

    public void insertCarType() {
    }

    public void insertCar() {
        Veiculo car = new Veiculo();
        CorVeiculo viatColor = new CorVeiculo();

        String matricula, modelo, marca, cor;
        int idProprietário, idVeículo, idTipo;

        System.out.println(" INSERIR VIATURA");

        System.out.print(" Matrícula: ");
        matricula = in.nextLine();
        car.setMatricula(matricula);

        System.out.print(" Modelo: ");
        modelo = in.nextLine();
        car.setModelo(modelo);

        System.out.print(" Marca: ");
        marca = in.nextLine();
        car.setMarca(marca);

        System.out.print(" Color: ");
        cor = in.nextLine();
        // TODO meter na tabela CORVEICULO de pois de ter ID

        // TODO mostrar os tipos de veiculo que existem
        System.out.print(" Escolha o tipo: ");
        String tipo = in.nextLine();
        // TODO validar que é int e que está nos valores apresentados
        idTipo = Integer.parseInt(tipo);
        car.setTipo(idTipo);

        // TODO mostrar todos os proprietarios
        System.out.print(" Proprietário ");
        String proprietario = in.nextLine();
        // TODO Validar ID proprietário
        idProprietário = Integer.parseInt(proprietario);
        car.setProprietario(idProprietário);


        // TODO Inserir viatura e gardar em idVeiculo o ID desta

        viatColor.setVeiculo(idVeículo);
        viatColor.setColor(cor);

        System.out.println(" Viatura inserida com sucesso.");
        // TODO: voltar a mostrar o menu
    }

    public void insertTrip() {
    }
}
