package az.et.part01.lesson05.demo_project;

import static az.et.part01.lesson05.demo_project.contant.Menu.LOGIN;
import static az.et.part01.lesson05.demo_project.contant.Menu.REGISTER;

import az.et.part01.lesson05.demo_project.config.Console;
import az.et.part01.lesson05.demo_project.config.LinuxConsole;
import az.et.part01.lesson05.demo_project.contant.Menu;
import az.et.part01.lesson05.demo_project.controller.UserController;
import az.et.part01.lesson05.demo_project.controller.UserControllerImpl;
import az.et.part01.lesson05.demo_project.dao.FileUserDao;
import az.et.part01.lesson05.demo_project.dao.InMemoryUserDao;
import az.et.part01.lesson05.demo_project.dao.PostgresUserDao;
import az.et.part01.lesson05.demo_project.dao.UserDao;
import az.et.part01.lesson05.demo_project.dto.User;
import az.et.part01.lesson05.demo_project.service.UserService;
import az.et.part01.lesson05.demo_project.service.UserServiceImpl;
import java.util.Scanner;

public class LoginRegisterApp {
    public static void main(String[] args) {
        final LoginRegisterApp app = new LoginRegisterApp();
        final Scanner scan = new Scanner(System.in);
        final Console  console = new LinuxConsole(scan);

        final UserDao userDao
//                = new PostgresUserDao();
//                = new MySqlUserDao();
//                = new FileUserDao();
                = new InMemoryUserDao();

        final UserService<User> userService
//                = new UserServiceImpl2(userDao);
                = new UserServiceImpl(userDao);

        final UserController<User> userController = new UserControllerImpl(userService);

        app.run(console, userController);
    }

    private void run(Console console, UserController<User> userController) {
        // show menu
        System.out.println("Welcome to the Login/Register App!");
        System.out.println(Menu.getMenu());

        // get user input
        console.print("Enter your choice [id]: ");
        final int id = console.readInt();
        final Menu menu = Menu.findMenuById(id);

        // process user input
        if (menu == LOGIN) {
            // get credentials
            // go to login controller
        }
        else if (menu == REGISTER) {
            console.print("Enter your full name: ");
            final String fullName = console.readLn();

            console.print("Enter your email: ");
            final String email = console.readLn();

            console.print("Enter your password: ");
            final String password = console.readLn();

            console.print("Enter your age: ");
            int age = console.readInt();

            User user = new User(fullName, email, password, age);
            userController.register(user);
        }
    }
}
