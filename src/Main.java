import model.*;

import java.util.Date;

import ui.UIMenu.*;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        char array[] = {'a','b','c'};

        System.out.println(array[0]);

        showMenu();

    }


}
        /*

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Nietsnie", "Correo@gamil.com");
        user.showDataUser();

        User userPa = new Patient("(.)y(.)","alguno@gmail.com");
        userPa.showDataUser();

        //clase anonima
        User user1 = new User("(.)Y(.)", "algo@") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz algo");
                System.out.println("Departamento: Chichis sanas");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

/*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);

    }*/




