package com.example;

import lombok.Setter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserList {

    public static List<User> getUsers() {
        List<User> userList = new ArrayList<User>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chandini", "kritter", "kritter");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM webAppUsers");
                while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                User user = new User(name, email);
                userList.add(user);
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    public static void addUser(User user) {
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chandini", "kritter", "kritter");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO webAppUsers (name, email) VALUES (?, ?)");
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

