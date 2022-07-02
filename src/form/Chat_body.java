/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import java.awt.Color;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;


public class Chat_body extends javax.swing.JPanel {

    public Chat_body() {
        initComponents();
        init();
        addTextLeft(" 23/05/2016 · ‎Notes is the best place to jot down quick thoughts "
                + "or to save longer notes filled with checklists, images, web links, "
                + "scanned documents, handwritten notes, or sketches. And with");
        addTextRight("Is your security info still accurate?\n" +
"We just want to make sure this security info is up-to-date, so we can use it to verify your identity "
                + "or alert you if there's ever a problem with your account.");
    }

    private void init(){
        body.setLayout(new MigLayout("fillx"));
        sp.setVerticalScrollBar(new JScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
    private void addTextLeft(String text){
        chat_left item = new chat_left();
        item.setText(text);
        body.add(item, "wrap, w ::75%");
        body.repaint();
        body.revalidate();
    }
        private void addTextRight(String text){
        Chat_right itm = new Chat_right();
        itm.setText(text);
        body.add(itm, "wrap, al right, w ::75%");
        body.repaint();
        body.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
