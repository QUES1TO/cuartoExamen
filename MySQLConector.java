import java.sql.*;
public class MySQLConector {
    private String url = "jdbc:mysql://localhost:3306/users";
    private String user = "root";
    private String password = "";
    public MySQLConector(){
       
    }
    public void crearConexion(String dato1, String dato2,String dato3){

        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            String insertQuery = "insert into user (nombre,apellido,año) "+
            "values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1,dato1);
            pstmt.setString(2,dato2);
            pstmt.setString(3,dato3);
            pstmt.executeUpdate();
            
            String selectQuery = "select * from user";
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery(selectQuery);
            while(resultado.next()){
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String yearNacido = resultado.getString("año");
                System.out.println("Nombre: " +nombre + " ,apellido: "+apellido + ", año: " + yearNacido) ;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
