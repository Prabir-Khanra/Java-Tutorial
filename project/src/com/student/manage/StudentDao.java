package com.student.manage;

import java.sql.*;

public class StudentDao {
    public static boolean insertStudentToDB(Student st) {
        boolean f = false;
        try {
            Connection con = CP.createC();
            String sql = "INSERT INTO student (name, phone, city) VALUES (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());
            pstmt.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f = false;
        try {
            Connection con = CP.createC();
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, userId);
            pstmt.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean showAllStudents() {
        boolean f = false;
        try {
            Connection con = CP.createC();
            String sql = "SELECT * FROM student;";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt(1);
                String name = result.getString(2);
                String phone = result.getString(3);
                String city = result.getString("city");
                System.out.println("ID: "+id);
                System.out.println("NAME: "+name);
                System.out.println("PHONE: "+phone);
                System.out.println("CITY: "+city);
            }
            f=true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }
}
