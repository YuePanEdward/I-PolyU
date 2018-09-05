/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 20153
 */
public class Background extends Assignment1{
    public Background() {
        JPanel p = new JPanel() {
            public void paint(Graphics g) {
                super.paint(g);
                ImageIcon ii = new ImageIcon("CampusMap.jpg");
                g.drawImage(ii.getImage(), 0, 0, getWidth(), getHeight(), ii.getImageObserver());
            }
        };
        p.add(new JButton("按钮"));// 窗口拖动大小时候按钮会被隐藏，当鼠标移动到按钮位置时候才会显示
        add(p);
        setSize(300, 300);
        setVisible(true);
}
}
