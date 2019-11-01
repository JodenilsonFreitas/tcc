package servelets;


import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*Author jode*/


  

public class Conexao {
    //gerencia a conexão com o banco
    Connection connection = null;
    //gerencia as consultas realizadas;
    Statement statement = null;
    //armazena os resultados de consulta e querys
    ResultSet resultset = null;

    
    //classe abre conexão com o banco
    public void conectar() {
        //parametros de conexão
        String banco="jdbc:mysql://localhost:3307/teste";
        String usuario="root";
        String senha="root";
        String driver="org.gjt.mm.mysql.Driver";
        try{
            //registro do driver
            Class.forName(driver);
            //realiza a conexão
            this.connection = (Connection) DriverManager.getConnection(banco, usuario, senha);
            //inicia o gerenciamento dos comandos
            this.statement = (Statement) this.connection.createStatement();
        }catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Erro-Conectar: "+e);
        }
    }
    
    
    //função para fechar a conexão com o banco de dados
    public void desconectar() {
        try {
            //realiza a fechamento
            connection.close();
        } catch (SQLException | HeadlessException e) {
            // em caso de erro
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro: " + e);
        }
    }
    
    public void Inserir(String tabela,
                        String campos,
                        String valores){
        String query="INSERT INTO "+tabela+
                     "("+campos+")VALUES("+valores+");";
        System.out.println(query);
        try{
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,
                                "Inserido com sucesso");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro: " + e);
        }
    }
    
    public void Update(String tabela,
                       String campos,
                       String regra){
        String query="UPDATE "+tabela+" SET "+campos+
                     " WHERE "+regra+";";
        System.out.println(query);
        try{
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,
                                "Atualizado com sucesso");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro: " + e);
        }
    }
    
    
    
    
    public void Delete(String tabela,
                       String regra){
        String query="DELETE FROM "+tabela+
                          " WHERE "+regra+";";
        System.out.println(query);
        try{
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,
                                "Deletado com sucesso");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro: " + e);
        }
    }
    
    public String Select(String tabela,
                         String campo,
                         String regra){
        String resultado="";
        String query="SELECT "+campo+" FROM"+
                     tabela+ " WHERE "+regra+";";
        System.out.println(query);
        try{
            this.resultset = statement.executeQuery(query);
            while(resultset.next()){
                resultado= resultset.getString(campo);
            }
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um erro: " + e);
        }
        return resultado;
    }

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
