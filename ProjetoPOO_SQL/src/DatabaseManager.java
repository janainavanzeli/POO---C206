import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    public static void createDatabase() {
        try (Connection connection = DatabaseConnection.getConnection("")) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP DATABASE IF EXISTS BancoSangue;");
            statement.executeUpdate("CREATE DATABASE BancoSangue;");
            System.out.println("Banco de dados criado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTables() {
        try (Connection connection = DatabaseConnection.getConnection("BancoSangue")) {
            Statement statement = connection.createStatement();

            String sql = "USE BancoSangue;" +
                    "CREATE TABLE Doadores (" +
                    "  idDoador INT AUTO_INCREMENT PRIMARY KEY," +
                    "  nome VARCHAR(45) NOT NULL," +
                    "  sexo ENUM('Masculino', 'Feminino', 'Outro') NOT NULL," +
                    "  datanascimento DATE NOT NULL," +
                    "  tiposanguineo VARCHAR(5) NOT NULL," +
                    "  email VARCHAR(100) NOT NULL," +
                    "  telefone VARCHAR(20) NOT NULL," +
                    "  endereco VARCHAR(200) NOT NULL," +
                    "  peso DECIMAL(5,2) NOT NULL," +
                    "  ultimadoacao DATE NOT NULL," +
                    "  historicomedico TEXT(1000) NOT NULL" +
                    ");" +
                    "CREATE TABLE Receptores (" +
                    "  idReceptores INT AUTO_INCREMENT PRIMARY KEY," +
                    "  nome VARCHAR(45) NOT NULL," +
                    "  sexo VARCHAR(45) NOT NULL," +
                    "  datanascimento DATE NOT NULL," +
                    "  tiposanguineo VARCHAR(5) NOT NULL," +
                    "  email VARCHAR(45) NOT NULL," +
                    "  telefone VARCHAR(45) NOT NULL," +
                    "  endereco VARCHAR(200) NOT NULL," +
                    "  hospital VARCHAR(100) NOT NULL," +
                    "  medicoresponsavel VARCHAR(45) NOT NULL," +
                    "  diagnostico VARCHAR(300) NOT NULL" +
                    ");" +
                    "CREATE TABLE Solicitacoes (" +
                    "  idSolicitacoes INT AUTO_INCREMENT PRIMARY KEY," +
                    "  datasolicitacao DATE NOT NULL," +
                    "  tiposanguineo VARCHAR(5) NOT NULL," +
                    "  estatus ENUM('Pendente', 'Atendida', 'Cancelada') NULL," +
                    "  Receptores_idReceptores INT NOT NULL" +
                    ");" +
                    "CREATE TABLE Doacoes (" +
                    "  idDoacoes INT AUTO_INCREMENT PRIMARY KEY," +
                    "  datadoacao DATE NOT NULL," +
                    "  tiposanguineo VARCHAR(5) NOT NULL," +
                    "  pressaoarterial VARCHAR(20) NOT NULL," +
                    "  pesodoador DECIMAL NOT NULL," +
                    "  Doadores_idDoador INT NOT NULL," +
                    "  Solicitacoes_idSolicitacoes INT NOT NULL" +
                    ");";

            statement.executeUpdate(sql);
            System.out.println("Tabelas criadas com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
