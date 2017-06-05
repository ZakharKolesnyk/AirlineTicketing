package com.gmail.kolesnyk.zakhar;

import com.gmail.kolesnyk.zakhar.airportService.AirportService;
import com.gmail.kolesnyk.zakhar.cityService.CityService;
import com.gmail.kolesnyk.zakhar.dao.seat.Seat;
import com.gmail.kolesnyk.zakhar.flightService.FlightService;
import com.gmail.kolesnyk.zakhar.ticketService.TicketService;
import com.gmail.kolesnyk.zakhar.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@Service
public class DEBUGGER_PANE extends JFrame {

    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;

    @Autowired
    private AirportService airportService;

    @Autowired
    private FlightService flightService;

    @Autowired
    private TicketService ticketService;

    public DEBUGGER_PANE() throws HeadlessException {
        setAlwaysOnTop(true);
        setSize(new Dimension(1020, 100));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JPanel() {{
            setLayout(new FlowLayout());
            setSize(new Dimension(1020, 100));
            setVisible(true);
            add(new JButton("perform1") {{
                setLocation(0, 0);
                setSize(250, 50);
                setVisible(true);
                addActionListener(e -> {
                    invoke1();
                });
            }});
            add(new JButton("perform2") {{
                setLocation(255, 0);
                setSize(250, 50);
                setVisible(true);
                addActionListener(e -> {
                    invoke2();
                });
            }});
            add(new JButton("perform3") {{
                setLocation(510, 0);
                setSize(250, 50);
                setVisible(true);
                addActionListener(e -> {
                    invoke3();
                });
            }});
            add(new JButton("perform4") {{
                setLocation(765, 0);
                setSize(250, 50);
                setVisible(true);
                addActionListener(e -> {
                    invoke4();
                });
            }});
        }});
//        }};
    }

    private void invoke1() {
        System.out.println("\n\n\n\n");
        userService.listUsers().forEach(a -> System.out.println(a.getFirstName()));
        System.out.println(userService.getUserById(1).getFirstName());
        cityService.listCity().forEach(System.out::println);
        cityService.listCityByIdCountry(1).forEach(System.out::println);
        cityService.listCityByIdCountry(2).forEach(System.out::println);
        airportService.listAirports().forEach(System.out::println);
        flightService.listFlights().forEach(System.out::println);
        System.out.println("\n\n\n\n");
    }

    private void invoke2() {

        ticketService.listTickets().forEach(System.out::println);

    }

    private void invoke3() {
        System.out.println(userService.getUserById(1).getFirstName());
    }

    private void invoke4() {
        System.out.println(userService.getUserById(1).getFirstName());
    }
}
