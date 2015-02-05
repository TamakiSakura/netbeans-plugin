/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeigniter.netbeans.documentation;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URL;
import java.net.URLEncoder;
import org.openide.awt.HtmlBrowser.URLDisplayer;

/**
 *
 * @author jim
 */
public class HelpSearchPanel extends javax.swing.JPanel {

    private boolean showingDefaultText = true;
    private final static String DEFAULT_TEXT = "Search CI Docs";

    /**
     * Creates new form HelpSearchPanel
     */
    public HelpSearchPanel() {
        initComponents();
        System.out.println("Init components done");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTextField = new javax.swing.JTextField();

        searchTextField.setForeground(java.awt.Color.gray);
        searchTextField.setText(org.openide.util.NbBundle.getMessage(HelpSearchPanel.class, "HelpSearchPanel.searchTextField.text")); // NOI18N
        searchTextField.setToolTipText(org.openide.util.NbBundle.getMessage(HelpSearchPanel.class, "HelpSearchPanel.searchTextField.toolTipText")); // NOI18N
        searchTextField.setPreferredSize(new java.awt.Dimension(150, 28));
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        if (!showingDefaultText) { // Only search if the user has entered something
            // Lookup the entered text in the online CodeIgniter help
            try {
                String searchText = URLEncoder.encode(searchTextField.getText(), "UTF-8");
                if (searchText.length() > 0) {
                    URLDisplayer.getDefault().showURL(
                            new URL("http://www.codeigniter.com/userguide3/search.html?q="
                                    + searchText + "&check_keywords=yes&area=default"));
                }
            } catch (Exception e) {
                // Do nothing
            }
        }
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        searchTextField.setText("");
        searchTextField.setForeground(Color.black);
        showingDefaultText = false;
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if (searchTextField.getText().length() == 0) {
            searchTextField.setForeground(Color.gray);
            searchTextField.setText(DEFAULT_TEXT);
            showingDefaultText = true;
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
