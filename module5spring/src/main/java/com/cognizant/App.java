// package com.cognizant;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

// public class App {

//     public static void main(String[] args) {

//         ApplicationContext context =
//                 new ClassPathXmlApplicationContext("applicationContext.xml");

//         GreetingService service =
//                 context.getBean("greetingService", GreetingService.class);

//         service.greet();
//     }
// }
// package com.cognizant;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

// public class App {

//     public static void main(String[] args) {

//         ApplicationContext context =
//                 new ClassPathXmlApplicationContext("applicationContext.xml");

//         Client client = context.getBean("client", Client.class);

//         client.displayMessage();

//     }

// }
package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = context.getBean("student", Student.class);

        student.display();

    }
}