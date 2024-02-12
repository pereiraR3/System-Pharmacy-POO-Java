package com.mycompany.main;

//Importando classes services
import com.mycompany.service.Funcionario;
import com.mycompany.service.Vendedor;
import com.mycompany.service.Farmaceutico;
import com.mycompany.service.Cliente;
import com.mycompany.products.NRemedio;
import com.mycompany.products.Produtos;
import com.mycompany.products.Remedio;

//Importando bibliotecas úteis
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class main {

        // Método para cadastrar os funcionários únicos da Farmácia LAV
        public static void cadastrarFuncionarios(ArrayList<Funcionario> funcionariosFarmacia, double SalarioBase) {
                Funcionario funcionarioAnthony = new Vendedor("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br",
                                SalarioBase,
                                "Anthony Ricardo Rodrigues Rezende", "072.417.431-02", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioAnthony);
                Funcionario funcionarioLetizia = new Farmaceutico("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(69) 98417-7172", "www.farmaciaLav.com.br",
                                SalarioBase * 2,
                                "Letízia Manuella Serqueira Eugênio", "012.237.441-02", "Farmacêutico", 1);
                funcionariosFarmacia.add(funcionarioLetizia);
                Funcionario funcionarioVinicius = new Vendedor("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br",
                                SalarioBase,
                                "Vinicius Padilha Vieira", "022.407.431-24", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioVinicius);
        }

        // Funcao que busca reconhecer se há algum cpf já registrado retornando true, se
        // verdadeiro e false se o contrário
        public static boolean verificandoCliente(ArrayList<Cliente> clienteFarmacia, String CPF) {

                for (int i = 0; i < clienteFarmacia.size(); i++) {
                        String cpfBuscado = clienteFarmacia.get(i).getCPF();
                        if (cpfBuscado.equals(CPF)) {
                                return true;
                        }
                }
                return false;
        }

        // Método feito para adicionar todos os produtos do estoque da Farmácia LAV
        public static ArrayList<Produtos> cadastrandoProdutos(ArrayList<Produtos> todosProdutos) {

                // Todos os produtos da Farmácia que se classificam como Remédios

                Produtos addProduto = new NRemedio("Fralda Supreme Care P", 49.90, "Outros", "Huggies",
                                "Kimberly-Clark", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Sabonete Líquido Relaxante Hora Do Sono", 26.99, "Outros", "Johnson's",
                                "Johnson & Johnson Industrial Ltda.", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Fio Dental Johnson's Reach Essencial Sabor Menta", 12.19, "Outros",
                                "Johnson's", "Johnson & Johnson", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Absorvente Externo Noturno Plus Noite e Dia Suave 32un", 26.72, "Outros",
                                "Sempre Livre", "Johnson & Johnson Industrial Ltda.", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Gatorade Frutas Cítricas Isotônico com 500ml", 9.25, "Outros", "Gatorade",
                                "X3 Brasil Soluções", "Bebidas");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Sorvete Kibon Cremosíssimo Napolitano 1,5 Litro", 29.90, "Outros", "Kibon",
                                "Kibon", "Alimentos");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Escova de dente portátil para viagem", 3.99, "Outros", "Needs", "Needs",
                                "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Protetor Solar Facial Sun Fresh Derm Care FPS 70 Pele Mista a Oleosa", 52.59,
                                "Outros", "Neutrogena", "Johnson & Johnson", "Cosméticos");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Hidratante Facial Vita C 50g", 27.99, "Outros", "Needs", "Needs",
                                "Cosméticos");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Desodorante Rexona Men Antibacterial Aerossol Antitranspirante 150ml", 16.49,
                                "Outros", "Rexona", "Rexona", "Higiene");
                todosProdutos.add(addProduto);

                // Todos os produtos da Farmácia que se classificam como N. Remédios

                addProduto = new Remedio("Benzetacil", 17.99, "Remédio", "Schering-Plough", true, "Injetável", 4,
                                "Schering-Plough",
                                "Antibióticos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Dipirona", 5.99, "Remédio", "EMS S/A", false, "Comprimidos", 10, "EMS S/A",
                                "Analgésicos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Neosoro", 6.29, "Remédio", "Neo Química", false, "Solução Gotas", 30,
                                "Neo Química", "Descongestionantes");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Rivotril", 27.01, "Remédio", "Roche", true, "Comprimidos", 30, "Roche",
                                "Ansiolíticos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Torsilax", 17.69, "Remédio", "Neo Química", false, "Comprimidos", 30,
                                "Neo Química", "Analgésicos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Isotretinoína", 82.75, "Remédio", "Eurofarma", true, "Cápsulas", 30,
                                "Eurofarma", "Antiacne");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Ivermectina", 18.69, "Remédio", "Germad", false, "Comprimidos", 4, "EMS S/A",
                                "Antiparasitários");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Sal de Fruta", 4.48, "Remédio", "GSK", false, "Em pó", 10, "GSK-Matriz",
                                "Antiácidos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Ciclo 21", 6.38, "Remédio", "União Química", false, "Comprimidos", 21,
                                "União Química", "Anticoncepcionais");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Ácido Mefenâmico", 7.61, "Remédio", "Medley", false, "Comprimidos", 12,
                                "Medley", "Anti-inflamatórios");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Resfenol", 11.35, "Remédio", "Kleyhertz", false, "Cápsulas", 10, "Kleyhertz",
                                "Antigripais");
                return todosProdutos;
        }

        // Funcao para buscar e retornar um produto do tipo Remedio na lista do produtos
        // Remédios
        public static Produtos buscandoRemedio(ArrayList<Produtos> remedios, String nomeRemedio) {
                for (int i = 0; i < remedios.size(); i++) {
                        if (remedios.get(i).getNome().equals(nomeRemedio)) {
                                Produtos resultado = remedios.get(i);
                                return resultado;
                        }
                }
                return null;
        }

        // Funcao para buscar e retornar um produto do tipo N. Remedio na lista dos
        // produtos N. Remedios
        public static Produtos buscandoNRemedio(ArrayList<Produtos> Nremedios, String nomeNRemedio) {
                for (int i = 0; i < Nremedios.size(); i++) {
                        if (Nremedios.get(i).getNome().equals(nomeNRemedio)) {
                                Produtos resultado = Nremedios.get(i);
                                return resultado;
                        }
                }
                return null;
        }

        // Funcao para concatenar e retornar a String com os nomes de todos os produtos
        // selecionados para comprar pelo cliente
        public static String comprasAtualCliente(Cliente cliente) {
                ArrayList<Produtos> produtosCliente = cliente.getCompras();
                String listaStringProdutos = "";
                for (int i = cliente.getContaCompras(); i < produtosCliente.size(); i++) {
                        listaStringProdutos += "-> " + produtosCliente.get(i).getNome() + "\n";
                }
                return listaStringProdutos;
        }

        // Função para calcular e retornar a soma de todos os produtos que estão no
        // carrinho do cliente
        public static double calculandoTotalCarrinho(Cliente cliente) {
                ArrayList<Produtos> produtosCliente = cliente.getCompras();
                double valorTotal = 0;

                for (int i = cliente.getContaCompras(); i < produtosCliente.size(); i++) {
                        valorTotal += produtosCliente.get(i).getPreco();
                }

                return valorTotal;
        }

        // Calculando o salário dos Funcionários da Farmácia LAV
        public static void calculaSalarioFuncionario(Funcionario funcionario,
                        ArrayList<Funcionario> farmaciaFuncionarios,
                        Cliente cliente, int flag) {

                ArrayList<Produtos> todosProdutos = cliente.getCompras();
                int i;

                for (i = 0; i < farmaciaFuncionarios.size(); i++) {
                        if (funcionario.getCPF().equals(farmaciaFuncionarios.get(i).getCPF())) {
                                break;
                        }
                }

                if (flag == 0) {
                        for (int j = cliente.getContaCompras(); j < todosProdutos.size(); j++) {
                                farmaciaFuncionarios.get(i).calcularSalarioPorProduto(todosProdutos.get(j));
                        }

                } else {
                        if (funcionario.getTipoFuncionario().equals("Farmacêutico")) {
                                for (int j = cliente.getContaCompras(); j < todosProdutos.size(); j++) {
                                        if (todosProdutos.get(j).getTipo().equals("Remédio")) {
                                                if (((Remedio) todosProdutos.get(j)).getTipoRemedio()
                                                                .equals("Injetável")) {
                                                        farmaciaFuncionarios.get(1)
                                                                        .calcularSalarioPorProduto(
                                                                                        todosProdutos.get(j));
                                                }
                                        }

                                }
                        } else {
                                for (int j = cliente.getContaCompras(); j < todosProdutos.size(); j++) {
                                        if (todosProdutos.get(j).getTipo().equals("Remédio")) {
                                                if (((Remedio) todosProdutos.get(j)).getTipoRemedio() != "Injetável") {
                                                        farmaciaFuncionarios.get(i)
                                                                        .calcularSalarioPorProduto(
                                                                                        todosProdutos.get(j));
                                                }
                                        } else if ((todosProdutos.get(j).getTipo().equals("Outros"))) {
                                                farmaciaFuncionarios.get(i)
                                                                .calcularSalarioPorProduto(
                                                                                todosProdutos.get(j));

                                        }
                                }
                        }
                }
        }

        // Inserindo o número de vendas
        public static void inserirVendas(Funcionario atendente, ArrayList<Funcionario> farmaciaFuncionarios,
                        int vendas) {
                int i;
                for (i = 0; i < farmaciaFuncionarios.size(); i++) {
                        if (atendente.getNome().equals(farmaciaFuncionarios.get(i).getNome())) {
                                break;
                        }
                }
                if (farmaciaFuncionarios.get(i).getTipoFuncionario().equals("Vendedor")) {
                        ((Vendedor) farmaciaFuncionarios.get(i)).setVendas(vendas);
                } else if (farmaciaFuncionarios.get(i).getTipoFuncionario().equals("Farmacêutico")) {
                        ((Farmaceutico) farmaciaFuncionarios.get(i)).setVendas(vendas);
                }
        }

        public static void alterarCarrinho(String NomeProduto, ArrayList<Produtos> produtosCliente) {

                for (int i = 0; i < produtosCliente.size(); i++) {
                        if (produtosCliente.get(i).getTipo().equals("Remédio")) {
                                if (((Remedio) produtosCliente.get(i)).getNome().equals(NomeProduto)) {
                                        produtosCliente.remove(i);
                                        break;
                                }
                        } else {
                                if (((NRemedio) produtosCliente.get(i)).getNome().equals(NomeProduto)) {
                                        produtosCliente.remove(i);
                                        break;
                                }
                        }
                }
        }

        // Criando o relatório de recibo por cliente, no qual está persistindo no
        // arquivo relatorioClienteRecibo.txt
        public static String relatorioPorCliente(Cliente cliente, ArrayList<Produtos> produtosCliente) {
                String relatorioCliente = "Cliente \nCPF: " + cliente.getCPF() + "\n\n** Produtos Comprados **\n\n";
                for (int i = 0; i < produtosCliente.size(); i++) {
                        relatorioCliente += "Nome: " + produtosCliente.get(i).getNome() + "\nTipo: "
                                        + produtosCliente.get(i).getTipo() +
                                        "\nMarca: " + produtosCliente.get(i).getMarca() + "\nPreço: "
                                        + produtosCliente.get(i).getPreco() + "\n\n";
                }

                relatorioCliente += "Valor Total da Compra: "
                                + formatarNumeroComDuasCasasDecimais(cliente.getValorTotalCompra())
                                + "\n\nObrigado pela Preferência\nVolte sempre, atenciosamente Farmácia LAV";

                return relatorioCliente;
        }

        // Funcao para retornar relatório do tipo String já adequadamente formatado
        public static String relatorioFinalDiaFarmacia(ArrayList<Cliente> clienteFarmacia,
                        ArrayList<Funcionario> Funcionarios) {

                double valorTotalDesconhecidos = 0;

                //////////////////////////// Relatório Funcionários //////////////

                String relatorio = "** Relatório de Funcionários **\n\n";
                double lucroBruto = 0;
                for (int i = 0; i < Funcionarios.size(); i++) {

                        relatorio = relatorio + "Nome do funcionário: " + Funcionarios.get(i).getNome() + "\n" +
                                        "Cargo: " + Funcionarios.get(i).getTipoFuncionario() + "\n";

                        if (Funcionarios.get(i).getTipoFuncionario().equals("Vendedor")) {
                                relatorio = relatorio + "Número de Vendas: "
                                                + ((Vendedor) Funcionarios.get(i)).getVendas() + "\n" +
                                                "Taxa de Comissão (%) por Produto: " + "10" + "\n" +
                                                "Taxa de Comissão por meta (%) sob Salário Base: " + "10" + "\n" +
                                                "Salário (R$): "
                                                + formatarNumeroComDuasCasasDecimais(Funcionarios.get(i).getSalario())
                                                + "\n";
                        } else if (Funcionarios.get(i).getTipoFuncionario().equals("Farmacêutico")) {
                                relatorio = relatorio + "Número de Vendas: "
                                                + ((Farmaceutico) Funcionarios.get(i)).getVendas() + "\n" +
                                                "Taxa de Comissão (%) por Produto: " + "10" + "\n" +
                                                "Taxa de Comissão por meta (%) sob Salário Base: " + "10" + "\n" +
                                                "Salário (R$): "
                                                + formatarNumeroComDuasCasasDecimais(Funcionarios.get(i).getSalario())
                                                + "\n";

                        }

                        // Calculando o lucroBruto
                        lucroBruto += Funcionarios.get(i).getLucroBruto();

                        relatorio = relatorio + "\n";
                }

                //////////////////////////// Relatório clientes ////////////////////////////////

                relatorio = relatorio + "\n** Relatório de Clientes **\n\n";

                for (Cliente C : clienteFarmacia) {
                        ArrayList<Produtos> todasCompras = C.getCompras();
                        if (C.getNome() != "Desconhecido") {
                                relatorio = relatorio + "Nome: " + C.getNome() + "\n" + "CPF: " + C.getCPF() + "\n"
                                                + "Quantidade de compras: " + todasCompras.size() + "\n"
                                                + "Valor total de compras (R$): "
                                                + formatarNumeroComDuasCasasDecimais(C.getValorTotalCompra()) + "\n\n";
                        } else {
                                valorTotalDesconhecidos += C.getValorTotalCompra();
                        }
                }

                relatorio = relatorio + "Valor total de não cadastrados: "
                                + formatarNumeroComDuasCasasDecimais(valorTotalDesconhecidos);
                relatorio += "\n\n** Lucro Bruto Farmácia LAV **\n\nValor Total: "
                                + formatarNumeroComDuasCasasDecimais(lucroBruto);
                return relatorio;
        }

        // Função para persistir as informações do relatorio em um arquivo ->
        // "relatorio.txt"
        public static void escrevendoArquivoFarmacia(String relatorioFarmacia) {
                try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(
                                        "farmaciaF/src/main/java/com/mycompany/file/relatorioFarmacia.txt"));
                        writer.write(relatorioFarmacia);
                        writer.close();
                        System.out.println("String relatorioFarmacia exportada com sucesso para o arquivo.");
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }

        public static void escrevendoReciboCliente(String relatorioClienteRecibo) {
                try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(
                                        "farmaciaF/src/main/java/com/mycompany/file/relatorioReciboCliente.txt",
                                        true));
                        writer.write(relatorioClienteRecibo);
                        writer.close();
                        System.out.println("String relatorioClienteRecibo exportada com sucesso para o arquivo.");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public static String lerArquivo(String diretorioArquivo) {

                try {
                        // Cria um objeto FileReader para ler o arquivo
                        FileReader arquivo = new FileReader(diretorioArquivo);

                        // Cria um objeto BufferedReader para ler linhas do arquivo
                        BufferedReader leitor = new BufferedReader(arquivo);

                        String linha;
                        String relatorio = "";

                        // Lê cada linha do arquivo até o final
                        while ((linha = leitor.readLine()) != null) {
                                // Faça algo com a linha lida, por exemplo, imprima-a
                                relatorio += linha + "\n";
                        }

                        // Fecha o arquivo após a leitura
                        leitor.close();
                        return relatorio;

                } catch (IOException e) {
                        // Trate exceções de E/S, como arquivo não encontrado
                        e.printStackTrace();
                        return "Erro de Leitura";
                }
        }

        public static void apagarArquivo(String diretorioArquivo) {
                try {
                        // Abre o arquivo no modo de escrita, o que substituirá o conteúdo existente
                        FileWriter escritor = new FileWriter(diretorioArquivo, false);

                        // Fecha o arquivo imediatamente para garantir que o conteúdo seja apagado
                        escritor.close();

                        System.out.println("Conteúdo do arquivo foi apagado com sucesso.");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        // Função de Busca da posição dos clientes em função de seu respectivo CPF
        public static int Buscar(ArrayList<Cliente> clienteFarmacia, String CPF) {
                for (int i = 0; i < clienteFarmacia.size(); i++) {
                        if (clienteFarmacia.get(i).getCPF().equals(CPF)) {
                                return i;
                        }
                }
                return -1;
        }

        // Funcao para formatar os valores vindos de cálculo de salário e comissões em
        // até 2 casas decimais
        public static String formatarNumeroComDuasCasasDecimais(double numero) {
                DecimalFormat formato = new DecimalFormat("0.00");
                return formato.format(numero);
        }

        public static Object cadastrando(Cliente clienteNovo, ArrayList<Cliente> clienteFarmacia,
                        Object selecionarOpcao) {
                // Cadastrando os Clientes
                JOptionPane.showMessageDialog(null,
                                "** Bem-Vindo ** \n\n Precisamos de algumas Informações \n\n CPF:\n Nome:\n Telefone:");
                String cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                // Verificando se o cpf do cliente atual já foi cadastrado
                if (verificandoCliente(clienteFarmacia, cpfCliente) && clienteFarmacia
                                .get(Buscar(clienteFarmacia, cpfCliente)).getNome() != "Desconhecido") {
                        JOptionPane.showMessageDialog(null, "Bem-vindo novamente !!");
                } else {

                        // Caso o cliente não esteja cadastrado...
                        String nomeCliente = JOptionPane.showInputDialog("Digite o seu Nome: ");
                        String telCliente = JOptionPane.showInputDialog("Digite o seu Telefone: ");

                        JOptionPane.showMessageDialog(null,
                                        "** Informações Passadas **\n\nCPF: " + cpfCliente + "\nNome: "
                                                        + nomeCliente + "\nTelefone: " + telCliente);

                        int resposta = JOptionPane.showConfirmDialog(null,
                                        "Você deseja alterar os dados ?",
                                        "Confirmação", JOptionPane.YES_NO_OPTION);
                        if (resposta == JOptionPane.YES_OPTION) {
                                Object[] opcaoCliente = { "CPF", "Nome", "Telefone", "Tudo" };

                                // Perguntando se o cliente-usuário deseja alterar algo
                                Object selecionaOpcaoCliente = JOptionPane.showInputDialog(
                                                null,
                                                "** Alteração de Dados **",
                                                "Opção",
                                                JOptionPane.INFORMATION_MESSAGE,
                                                null,
                                                opcaoCliente,
                                                null

                                );

                                // Todas as opções de alteração de Dados

                                if (selecionaOpcaoCliente.equals("CPF")) {
                                        cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                                } else if (selecionaOpcaoCliente.equals("Nome")) {
                                        nomeCliente = JOptionPane
                                                        .showInputDialog("Digite o seu Nome: ");

                                } else if (selecionaOpcaoCliente.equals("Telefone")) {
                                        telCliente = JOptionPane
                                                        .showInputDialog("Digite o seu Telefone: ");

                                } else if (selecionaOpcaoCliente.equals("Tudo")) {

                                        cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                                        nomeCliente = JOptionPane
                                                        .showInputDialog("Digite o seu Nome: ");
                                        telCliente = JOptionPane
                                                        .showInputDialog("Digite o seu Telefone: ");

                                }

                        }

                        // Inserindo todos as informações na classe cliente instanciado como clienteNovo
                        clienteNovo.setCPF(cpfCliente);
                        clienteNovo.setNome(nomeCliente);
                        clienteNovo.setTelefone(telCliente);

                        // Verificando se o CPF já foi cadastrado
                        if (verificandoCliente(clienteFarmacia, cpfCliente)) {
                                int posCliente = Buscar(clienteFarmacia, cpfCliente);
                                clienteFarmacia.set(posCliente, clienteNovo);
                        } else {
                                clienteFarmacia.add(clienteNovo);

                        }
                }

                return selecionarOpcao = "Comprar";

                /////////// Caso o usuário clique em "Comprar" vai entrar aqui ///////////
        }

        public static void comprando(Funcionario atendente, Funcionario auxAtendente,
                        ArrayList<Funcionario> farmaciaFuncionarios,
                        ArrayList<Cliente> clienteFarmacia, int comprasVendedor, int comprasFarmaceutico,
                        Cliente clienteNovo, ArrayList<Produtos> produtosFarmacia, int respostaFecharCarrinhoCliente,
                        int flag, Random random) {

                // Mostrando que o atendimento foi direcionado a um dos funcionários da farmácia
                // LAV
                atendente = farmaciaFuncionarios.get(random.nextInt(3));
                JOptionPane.showMessageDialog(null,
                                "Atendimento com:\n\n Nome: " + atendente.getNome()
                                                + "\n Cargo: "
                                                + atendente.getTipoFuncionario());

                // Pedindo CPF do cliente-usuário, para verificar se já tem cadastro ou não
                String cpf = JOptionPane.showInputDialog("Passe o seu CPF:");
                if (!verificandoCliente(clienteFarmacia, cpf)) {
                        comprasVendedor = 0;
                        comprasFarmaceutico = 0;
                }

                while (true) {

                        boolean receitaCliente = true;

                        // Mostrando as opções Remédio e não remédio
                        if (Buscar(clienteFarmacia, cpf) == -1) {
                                clienteNovo.setCPF(cpf);
                                clienteNovo.setNome("Desconhecido");
                                clienteFarmacia.add(clienteNovo);
                        }

                        String[] opcaoCompra = { "Remédios", "Outros" };
                        String compraSelecionada = (String) JOptionPane.showInputDialog(
                                        null,
                                        "Escolha uma opção:",
                                        "Menu Compras - LAV",
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        opcaoCompra,
                                        opcaoCompra[0]);

                        /////////// Caso o usuário clique em Remédios ///////////
                        if (compraSelecionada.equals("Remédios")) {

                                ArrayList<Produtos> listaRemedios = new ArrayList<Produtos>();
                                int countRemedios = 0;

                                // Coletando Produtos do Tipo Remédio

                                for (int i = 0; i < produtosFarmacia.size(); i++) {
                                        if (produtosFarmacia.get(i).getTipo().equals("Remédio")) {
                                                listaRemedios.add(((Remedio) produtosFarmacia.get(i)));
                                                countRemedios++;
                                        }
                                }

                                Object[] nomesRemedios = new Object[countRemedios];

                                for (int i = 0; i < countRemedios; i++) {
                                        nomesRemedios[i] = ((Remedio) listaRemedios.get(i))
                                                        .getNomeRemedio();
                                }

                                Produtos produtoCliente = null;

                                // Interface para selecionar o produtos, dentro do estoque da Farmácia
                                // LAV
                                String compraRemedio = (String) JOptionPane.showInputDialog(
                                                null,
                                                "Escolha uma opção:",
                                                "Menu Compras - LAV",
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                nomesRemedios,
                                                nomesRemedios[0]);

                                // Caso algum produto, seja selecionado seguimos...
                                if (compraRemedio != "") {
                                        produtoCliente = buscandoRemedio(listaRemedios,
                                                        (String) compraRemedio);
                                        boolean receita = ((Remedio) produtoCliente)
                                                        .getReceitaRemedio();
                                        if (receita) {

                                                int resposta = JOptionPane.showConfirmDialog(null,
                                                                "Você possui Receita ?",
                                                                "Confirmação",
                                                                JOptionPane.YES_NO_OPTION);
                                                if (resposta != JOptionPane.YES_OPTION) {
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Para comprar esse remédio,\n você precisa de receita");
                                                        receitaCliente = false;

                                                }
                                        }

                                        if (receitaCliente) {
                                                // Usando o atributo nível de acesso que vem do implements
                                                // painel de controle
                                                // para classificar se o atendente tem acesso para aplicar
                                                // injetáveis ou não
                                                if (((Remedio) produtoCliente).getTipoRemedio()
                                                                .equals("Injetável")) {
                                                        if (atendente.nivelAcesso == 0) {
                                                                auxAtendente = farmaciaFuncionarios.get(1);

                                                                JOptionPane.showMessageDialog(null,
                                                                                "Vamos te encaminhar para a farmacêutica\npara realizar a aplicação do injetável\n\nFarmacêutica: "
                                                                                                + auxAtendente.getNome());

                                                                flag = 1;
                                                        }
                                                }

                                                if (atendente.getNome()
                                                                .equals("Letízia Manuella Serqueira Eugênio")) {
                                                        comprasFarmaceutico++;
                                                } else {
                                                        comprasVendedor++;
                                                }
                                        }

                                }

                                if (receitaCliente) {
                                        // Interface, perguntando ao usuário cliente se ele desej a adicionar ao
                                        // carrinho ou não
                                        int respostaClienteProduto = JOptionPane.showConfirmDialog(null,
                                                        "Deseja colocar no carrinho ?\n\nNome: "
                                                                        + produtoCliente.getNome() +
                                                                        "\nMarca: "
                                                                        + produtoCliente.getMarca()
                                                                        + "\nPreço: "
                                                                        + produtoCliente.getPreco()
                                                                        + "\n",

                                                        "Sobre o Produto",
                                                        JOptionPane.YES_NO_OPTION);

                                        // Caso deseje adicionar, prosseguimos por aqui
                                        if (respostaClienteProduto == JOptionPane.YES_OPTION) {

                                                clienteFarmacia.get(Buscar(clienteFarmacia, cpf))
                                                                .setCompras(produtoCliente);
                                                double valorTotal = calculandoTotalCarrinho(clienteFarmacia
                                                                .get(Buscar(clienteFarmacia, cpf)));
                                                String comprasAtualCliente = comprasAtualCliente(clienteFarmacia
                                                                .get(Buscar(clienteFarmacia, cpf)));
                                                JOptionPane.showMessageDialog(null,
                                                                "** Seu carrinho **\nValor Total: "
                                                                                + formatarNumeroComDuasCasasDecimais(
                                                                                                valorTotal)
                                                                                + "\n\n" + comprasAtualCliente);
                                        }
                                }
                                /////////// Caso o usuário selecione Outros vai entrar aqui ///////////
                        } else if (compraSelecionada.equals("Outros")) {

                                if (atendente.getNome().equals("Letízia Manuella Serqueira Eugênio")) {
                                        comprasFarmaceutico++;
                                } else {
                                        comprasVendedor++;
                                }

                                // Coletando os produtos do tipo "Outros" em um arrayList
                                ArrayList<Produtos> listaNRemedios = new ArrayList<Produtos>();
                                int countNRemedios = 0;
                                for (int i = 0; i < produtosFarmacia.size(); i++) {
                                        if (produtosFarmacia.get(i).getTipo().equals("Outros")) {
                                                listaNRemedios.add(
                                                                ((NRemedio) produtosFarmacia.get(i)));
                                                countNRemedios++;
                                        }
                                }

                                // Preparando o object, no qual a interface vai precisar para mostrar o
                                // leque de
                                // produtos do tipo "Outros"

                                Object[] nomesNRemedios = new Object[countNRemedios];
                                for (int i = 0; i < countNRemedios; i++) {
                                        nomesNRemedios[i] = ((NRemedio) listaNRemedios.get(i))
                                                        .getNomeProduto();
                                }

                                Produtos produtoCliente = null;

                                // Mostrando a interface com os produtos do tipo "Outros"
                                String compraNRemedio = (String) JOptionPane.showInputDialog(
                                                null,
                                                "Escolha uma opção:",
                                                "Menu Compras - LAV",
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                nomesNRemedios,
                                                nomesNRemedios[0]);

                                // Caso algum produto seja selecionado, prosseguimos...
                                if (compraNRemedio != "") {

                                        produtoCliente = buscandoNRemedio(listaNRemedios,
                                                        (String) compraNRemedio);

                                }

                                // Mostrando as caracteríticas do produto do tipo "Outros" que foi
                                // selecionado + perguntando se deseja adicioná-lo no carrinho
                                int respostaClienteProduto = JOptionPane.showConfirmDialog(null,
                                                "Deseja colocar no carrinho ?\n\nNome: "
                                                                + produtoCliente.getNome() +
                                                                "\nMarca: "
                                                                + produtoCliente.getMarca()
                                                                + "\nPreço: "
                                                                + produtoCliente.getPreco()
                                                                + "\n",

                                                "Sobre o Produto",
                                                JOptionPane.YES_NO_OPTION);

                                // Caso o usuário-cliente desejar, prosseguimos
                                if (respostaClienteProduto == JOptionPane.YES_OPTION) {

                                        clienteFarmacia.get(Buscar(clienteFarmacia, cpf))
                                                        .setCompras(produtoCliente);
                                        double valorTotal = calculandoTotalCarrinho(clienteFarmacia
                                                        .get(Buscar(clienteFarmacia, cpf)));
                                        String comprasAtualCliente = comprasAtualCliente(clienteFarmacia
                                                        .get(Buscar(clienteFarmacia, cpf)));
                                        JOptionPane.showMessageDialog(null,
                                                        "** Seu carrinho **\nValor Total: "
                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                        valorTotal)
                                                                        + "\n\n" + comprasAtualCliente);
                                }

                        }

                        // Perguntando ao cliente-usuário se deseja continuar comprando

                        int resposta = JOptionPane.showConfirmDialog(null,
                                        "Deseja continuar comprando ?",
                                        "Confirmação",
                                        JOptionPane.YES_NO_OPTION);

                        // Caso sim, prosseguimos
                        if (resposta != JOptionPane.YES_OPTION) {

                                if (clienteNovo.getCompras() != null) {
                                        String comprasAtualCliente = "";
                                        if (Buscar(clienteFarmacia, cpf) != -1) {
                                                comprasAtualCliente = comprasAtualCliente(
                                                                clienteFarmacia.get(Buscar(
                                                                                clienteFarmacia, cpf)));
                                        } else {
                                                comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                        }

                                        // Mostrando tudo que há no carrinho do usuário-cliente até o
                                        // momento

                                        int respostaFecharCarrinho = JOptionPane.showConfirmDialog(null,
                                                        "** No seu carrinho tem: **\n\n"
                                                                        + comprasAtualCliente
                                                                        + "\n\n Deseja fechar o carrinho ?",
                                                        "Confirmação",
                                                        JOptionPane.YES_NO_OPTION);

                                        if (respostaFecharCarrinho != JOptionPane.YES_OPTION) {
                                                respostaFecharCarrinhoCliente = 0;
                                        } else {
                                                respostaFecharCarrinhoCliente = 1;
                                        }

                                        // Se o cliente-usuário clicar em sim...
                                        if (respostaFecharCarrinho == JOptionPane.YES_OPTION) {

                                                // Analisando se u usuário-cliente quer alterar o
                                                // carrinho ?
                                                int editarCarrinho = JOptionPane
                                                                .showConfirmDialog(null,
                                                                                "Antes de fechar, deseja editar o carrinho ?",
                                                                                "Confirmação",
                                                                                JOptionPane.YES_NO_OPTION);

                                                while (true) {
                                                        if (editarCarrinho == JOptionPane.YES_OPTION) {
                                                                int tamanhoCarrinho = clienteNovo
                                                                                .getCompras()
                                                                                .size();

                                                                String[] nomesProdutosCarrinho = new String[tamanhoCarrinho];
                                                                for (int i = 0; i < tamanhoCarrinho; i++) {

                                                                        Produtos produtoAtual = clienteNovo
                                                                                        .getCompras()
                                                                                        .get(i);

                                                                        nomesProdutosCarrinho[i] = produtoAtual
                                                                                        .getNome();
                                                                }

                                                                // Mostrando a interface com os produtos
                                                                // do tipo
                                                                // "Outros"
                                                                String selecionaProdutoCarrinho = (String) JOptionPane
                                                                                .showInputDialog(
                                                                                                null,
                                                                                                "Escolha um produto para retirar:",
                                                                                                "Menu de Alteração de Carrinho",
                                                                                                JOptionPane.QUESTION_MESSAGE,
                                                                                                null,
                                                                                                nomesProdutosCarrinho,
                                                                                                nomesProdutosCarrinho[0]);
                                                                if (selecionaProdutoCarrinho != "") {
                                                                        alterarCarrinho(selecionaProdutoCarrinho,
                                                                                        clienteNovo.getCompras());
                                                                }
                                                                // Retirando uma venda do funcionário
                                                                // que atendeu o cliente
                                                                if (auxAtendente != null) {
                                                                        if (selecionaProdutoCarrinho
                                                                                        .equals("Benzetacil")) {
                                                                                auxAtendente.setVendas(
                                                                                                auxAtendente.getVendas()
                                                                                                                - 1);
                                                                        } else {
                                                                                atendente.setVendas(
                                                                                                atendente.getVendas()
                                                                                                                - 1);
                                                                        }
                                                                } else {
                                                                        atendente.setVendas(
                                                                                        atendente.getVendas()
                                                                                                        - 1);
                                                                }

                                                                // Perguntando ao cliente-usuário se ele
                                                                // deseja continuar a alteração

                                                                int continuarEditando = JOptionPane
                                                                                .showConfirmDialog(null,
                                                                                                "Deseja continuar alterando ?",
                                                                                                "Confirmação",
                                                                                                JOptionPane.YES_NO_OPTION);

                                                                if (continuarEditando != JOptionPane.YES_OPTION) {
                                                                        break;
                                                                }
                                                        } else {
                                                                break;
                                                        }
                                                }

                                                double valorTotal = calculandoTotalCarrinho(
                                                                clienteFarmacia.get(Buscar(
                                                                                clienteFarmacia, cpf)));

                                                if (verificandoCliente(clienteFarmacia, cpf)
                                                                && clienteFarmacia.get(Buscar(
                                                                                clienteFarmacia, cpf))
                                                                                .getNome() != "Desconhecido") {

                                                        // Caso o usuário-cliente tenha cadastro, vamos
                                                        // mostrar essa tela

                                                        JOptionPane.showMessageDialog(null,
                                                                        "[Pagamento] - Você tem Cadastro.\n\nValor Total: R$"
                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                        valorTotal)
                                                                                        + "\nCom desconto de 10%: R$"
                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                        valorTotal * 0.9));
                                                        clienteFarmacia.get(
                                                                        Buscar(clienteFarmacia, cpf))
                                                                        .setValorTotalCompra(valorTotal
                                                                                        * 0.9);
                                                        ;
                                                } else {

                                                        // Caso o usuário-cliente não tenha cadastro,
                                                        // vamos mostrar essa tela
                                                        JOptionPane.showMessageDialog(null,
                                                                        "[Pagamento] - Você não tem Cadastro.\n\nValor Total: R$"
                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                        valorTotal));
                                                        clienteFarmacia.get(
                                                                        Buscar(clienteFarmacia, cpf))
                                                                        .setValorTotalCompra(
                                                                                        valorTotal);

                                                }

                                                if (clienteNovo.getCompras().size() > 0
                                                                && clienteNovo.getValorTotalCompra() > 0) {
                                                        // Mostrando o recibo de compra e pagamento do cliente, de
                                                        // acordo com o
                                                        // seu carrinho

                                                        int desejaRecibo = JOptionPane
                                                                        .showConfirmDialog(null,
                                                                                        "Deseja recibo da compra ?",
                                                                                        "Confirmação",
                                                                                        JOptionPane.YES_NO_OPTION);

                                                        String relatorioCliente = relatorioPorCliente(clienteNovo,
                                                                        clienteNovo.getCompras());

                                                        if (desejaRecibo == JOptionPane.YES_OPTION) {
                                                                JOptionPane.showMessageDialog(null, relatorioCliente);
                                                        }

                                                        escrevendoReciboCliente(relatorioCliente);

                                                        // Caso o atendimento de um vendedor precisou passar
                                                        // alguma aplicação para
                                                        // a farmacêutica Letizia flag será 1, logo prosseguimos
                                                        // por aqui... e isso mudará o funcionamento da Função
                                                        // calculaSalarioFuncionario

                                                        // Inserindo vendas + calculando salário

                                                        if ((flag == 1) && (atendente
                                                                        .getTipoFuncionario() != "Farmacêutico")) {
                                                                comprasFarmaceutico++;
                                                                comprasVendedor--;
                                                                inserirVendas(auxAtendente,
                                                                                farmaciaFuncionarios,
                                                                                comprasFarmaceutico);

                                                                calculaSalarioFuncionario(auxAtendente,
                                                                                farmaciaFuncionarios,
                                                                                clienteFarmacia.get(
                                                                                                Buscar(clienteFarmacia,
                                                                                                                cpf)),
                                                                                flag);
                                                        }

                                                        // Inserindo vendas + calculando salário

                                                        if (atendente.getTipoFuncionario()
                                                                        .equals("Vendedor")) {
                                                                inserirVendas(atendente,
                                                                                farmaciaFuncionarios,
                                                                                comprasVendedor);
                                                        } else if (atendente.getTipoFuncionario()
                                                                        .equals("Farmacêutico")) {
                                                                inserirVendas(atendente,
                                                                                farmaciaFuncionarios,
                                                                                comprasFarmaceutico);
                                                        }
                                                        calculaSalarioFuncionario(atendente,
                                                                        farmaciaFuncionarios,
                                                                        clienteFarmacia.get(Buscar(
                                                                                        clienteFarmacia,
                                                                                        cpf)),
                                                                        flag);

                                                        // Abaixo estamos "setando" o número de compras
                                                        // realizadas com os funcionários, seja do
                                                        // tipo vendedor ou do tipo farmacêutico

                                                        if (atendente.getTipoFuncionario().equals("Vendedor")) {
                                                                clienteFarmacia.get(
                                                                                Buscar(clienteFarmacia, cpf))
                                                                                .setContaCompras(
                                                                                                comprasVendedor);
                                                        } else {
                                                                clienteFarmacia.get(
                                                                                Buscar(clienteFarmacia, cpf))
                                                                                .setContaCompras(
                                                                                                comprasFarmaceutico);
                                                        }
                                                }

                                        }
                                }
                                if (respostaFecharCarrinhoCliente == 1) {
                                        break;
                                }
                        }
                }
        }

        public static void main(String[] args) {

                // Criando a flag para validacao de casos de aplicação de injetáveis
                int flag = 0;

                // Lista para incluir Todos os produtos
                ArrayList<Produtos> produtosFarmacia = new ArrayList<Produtos>();

                // Lista para incluir todos os clientes atendidos na farmácia
                ArrayList<Cliente> clienteFarmacia = new ArrayList<Cliente>();

                // Coletando informações sobre a Farmacia
                String NomeFarmacia = "LAV";
                String CNPJ = "48. 048. 138/0001-79";
                String Telefone = "(66) 99233-7652";
                String Endereco = "Boa Esperança, Rua 8, N. 254";
                String Site = "www.farmacialav.com.br";
                double SalarioBase = 1300;

                // Lista para incluir os funcionários da Farmácia
                ArrayList<Funcionario> farmaciaFuncionarios = new ArrayList<Funcionario>();
                cadastrarFuncionarios(farmaciaFuncionarios, SalarioBase);

                // Cadastrando Todos os Produtos - 10 Remédios & 10 N. Remédios
                produtosFarmacia = cadastrandoProdutos(produtosFarmacia);

                while (true) {

                        // Armazennando a flag para permitir continuidade do carrinho
                        int respostaFecharCarrinhoCliente = 0;

                        // Armazenar a quantidade de compras efetuadas pelo cliente
                        int comprasVendedor = 0;
                        int comprasFarmaceutico = 0;

                        // Atualizando o flag para 0 novamente, pois receberemos um novo cliente;
                        flag = 0;

                        // Instanciano uma var random, pois vamos preciÇsar para randomizar o
                        // atendimento do cliente, de acordo com os funcionários fixos
                        Random random = new Random();
                        Funcionario auxAtendente = null;
                        Funcionario atendente = null;

                        // Instanciando Cliente + Definição e Informações
                        Cliente clienteNovo = new Cliente("", "", "");

                        JOptionPane.showMessageDialog(null,
                                        "** Farmácia LAV **\n\n Nome: " + NomeFarmacia
                                                        + "\n CNPJ: "
                                                        + CNPJ + "\n Telefone: " + Telefone + "\n Endereço: "
                                                        + Endereco
                                                        + "\n Site: " + Site + "\n\n [ FARMÁCIA ABERTA ]");

                        JOptionPane.showMessageDialog(null,
                                        "[AVISO] Para garantir desconto de 10%, realize o seu cadastro.");
                        Object[] opcao = { "Cadastrar", "Comprar", "Sair" };

                        // Mostrando o *Menu LAV*, onde o cliente-usuário decide o que fazer (comprar,
                        // cadastrar, sair)
                        Object selecionarOpcao = JOptionPane.showInputDialog(
                                        null,
                                        "** Menu LAV **",
                                        "Opção",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        opcao,
                                        null);

                        // Apresentando as Informções que os Clientes devem inserir
                        if (selecionarOpcao.equals("Cadastrar")) {

                                // retorno porque ao cadastrar quero encaminha o usuário-cliente para as
                                // compras, logo
                                // devo alterar a variavell selecionarOpcao
                                selecionarOpcao = cadastrando(clienteNovo, clienteFarmacia, selecionarOpcao);
                        }
                        if (selecionarOpcao.equals("Comprar")) {

                                comprando(atendente, auxAtendente, farmaciaFuncionarios,
                                                clienteFarmacia,
                                                comprasVendedor, comprasFarmaceutico, clienteNovo, produtosFarmacia,
                                                respostaFecharCarrinhoCliente, flag, random);

                        } else if (selecionarOpcao.equals("Sair")) {

                                // relatorio Farmacia [relatório cliente + relatório funcionário + lucroBruto]

                                String relatorioFarmacia = relatorioFinalDiaFarmacia(clienteFarmacia,
                                                farmaciaFuncionarios);

                                // Adicionando relatório no arquivo, a informação vai persistir em
                                // "relatorio.txt", caso haja algo escrito ele limpa o arquivo e escreve
                                // novamente
                                escrevendoArquivoFarmacia(relatorioFarmacia);

                                // Toto o relatório geral da Farmácia LAV foi encaminhado para o arquivo
                                // relatorioFarmacia
                                // O break abaixo é usado para parar o programa totalmente;

                                String[] decideRelatorio = { "Limpar Relatório Geral", "Ver Relatório Geral" };

                                String opcaoRelatorio = (String) JOptionPane.showInputDialog(
                                                null,
                                                "Escolha uma opção:",
                                                "Menu Compras - LAV",
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                decideRelatorio,
                                                decideRelatorio[0]);
                                if (opcaoRelatorio.equals("Ver Relatório Geral")) {
                                        String conteudo = "farmaciaF/src/main/java/com/mycompany/file/relatorioFarmacia.txt";
                                        conteudo = lerArquivo(conteudo);
                                        JOptionPane.showMessageDialog(null, conteudo);
                                } else if (opcaoRelatorio.equals("Limpar Relatório Geral")) {
                                        apagarArquivo("farmaciaF/src/main/java/com/mycompany/file/relatorioFarmacia.txt");
                                        JOptionPane.showMessageDialog(null, "Arquivo de relatório geral apagado!");
                                }

                                break;

                        }

                }
        }
}