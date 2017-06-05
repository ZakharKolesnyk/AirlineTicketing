package com.gmail.kolesnyk.zakhar;

import com.gmail.kolesnyk.zakhar.dao.user.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.awt.*;

@Service
public class DebuggerPane extends JFrame {

    @Autowired
    private UserDao userDao;

    public DebuggerPane() throws HeadlessException {
        setAlwaysOnTop(true);
        setSize(new Dimension(1020, 100));
        setVisible(true);
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
        userDao.list().forEach(a-> System.out.println(a.getFirstName()));
    }

    private void invoke2() {
        System.out.println(userDao.selectById(1).getFirstName());
    }
    private void invoke3() {
        System.out.println(userDao.selectById(1).getFirstName());
    }
    private void invoke4() {
        System.out.println(userDao.selectById(1).getFirstName());
    }
}
