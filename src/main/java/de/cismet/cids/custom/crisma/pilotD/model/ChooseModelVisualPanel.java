/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.custom.crisma.pilotD.model;

import org.jdesktop.swingx.decorator.SortOrder;

import org.openide.util.NbBundle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 * DOCUMENT ME!
 *
 * @author   mscholl
 * @version  $Revision$, $Date$
 */
public class ChooseModelVisualPanel extends javax.swing.JPanel {

    //~ Instance fields --------------------------------------------------------

    private final transient ChooseModelWizardPanel model;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXList jXList1;
    private org.jdesktop.swingx.JXList jXList2;
    // End of variables declaration//GEN-END:variables

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates new form ChooseModelVisualPanel.
     *
     * @param  model  DOCUMENT ME!
     */
    public ChooseModelVisualPanel(final ChooseModelWizardPanel model) {
        this.model = model;

        initComponents();

        final DefaultListModel<Percs> allModel = new DefaultListModel<Percs>();
        allModel.addElement(new Percs("Building Hazard [Model]", 0));
        allModel.addElement(new Percs("Forest Fire Hazard [Model]", 0));
        allModel.addElement(new Percs("Building Impact [Model]", -1));
        allModel.addElement(new Percs("Population Impact [Model]", -1));
        allModel.addElement(new Percs("Road Network Impact [Model]", -1));
        allModel.addElement(new Percs("Building Resistance [Mitigation]", -1));
        allModel.addElement(new Percs("People Congestion Reduction [Mitigation]", -1));

        jXList1.setModel(allModel);

        jXList1.setSortOrder(SortOrder.ASCENDING);
        jXList1.setCellRenderer(new DefaultListCellRenderer() {

                @Override
                public Component getListCellRendererComponent(final JList<?> arg0,
                        final Object arg1,
                        final int arg2,
                        final boolean arg3,
                        final boolean arg4) {
                    final JLabel l = (JLabel)super.getListCellRendererComponent(arg0, arg1, arg2, arg3, arg4); // To change body of generated methods, choose Tools | Templates.

                    if (jCheckBox1.isSelected()) {
                        if (((Percs)arg1).name.contains("Hazard")) {
                            l.setText(((Percs)arg1).name + " ( " + ((Percs)arg1).perc + " \u2030 )");
                        } else {
                            l.setText(((Percs)arg1).name);
                            l.setEnabled(false);
                        }
                    } else {
                        l.setText(((Percs)arg1).name);
                    }

                    return l;
                }
            });
        jXList2.setCellRenderer(new DefaultListCellRenderer() {

                @Override
                public Component getListCellRendererComponent(final JList<?> arg0,
                        final Object arg1,
                        final int arg2,
                        final boolean arg3,
                        final boolean arg4) {
                    final JLabel l = (JLabel)super.getListCellRendererComponent(arg0, arg1, arg2, arg3, arg4); // To change body of generated methods, choose Tools | Templates.
                    l.setText(((Percs)arg1).name);

                    return l;
                }
            });
        jCheckBox1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(final ActionEvent e) {
                    jXList1.repaint();
                }
            });

        final DefaultListModel<String> selModel = new DefaultListModel<String>();
        jXList2.setModel(selModel);
        jXList2.setSortOrder(SortOrder.UNSORTED);
        jXList2.getModel().addListDataListener(new ListDataListener() {

                @Override
                public void intervalAdded(final ListDataEvent e) {
                    contentsChanged(e);
                }

                @Override
                public void intervalRemoved(final ListDataEvent e) {
                    contentsChanged(e);
                }

                @Override
                public void contentsChanged(final ListDataEvent e) {
                    final ArrayList l = new ArrayList();
                    for (final Object o : ((DefaultListModel)jXList2.getModel()).toArray()) {
                        l.add(((Percs)o).name);
                    }
                    model.setSelectedModels(l);
                    if (l.isEmpty()) {
                        allModel.get(0).perc = 0;
                        allModel.get(1).perc = 0;
                    } else {
                        allModel.get(0).perc = Math.round(Math.random() * 100);
                        allModel.get(1).perc = Math.round(Math.random() * 100);
                    }
                    jXList1.repaint();
                }
            });

        setName("Choose Transitions");
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    public ChooseModelWizardPanel getModel() {
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXList1 = new org.jdesktop.swingx.JXList();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXList2 = new org.jdesktop.swingx.JXList();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0),
                new java.awt.Dimension(0, 0),
                new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0),
                new java.awt.Dimension(0, 0),
                new java.awt.Dimension(0, 32767));
        jCheckBox1 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1024, 768));
        setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
                NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jPanel1.border.title"))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setViewportView(jXList1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel3.add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
                NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jPanel2.border.title"))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jXList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jXList2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jToolBar1.setRollover(true);

        jButton5.setText(NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jButton5.text")); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });
        jToolBar1.add(jButton5);

        jButton6.setText(NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jButton6.text")); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });
        jToolBar1.add(jButton6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jToolBar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel3.add(jPanel2, gridBagConstraints);

        jButton1.setText(NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 5);
        jPanel3.add(jButton1, gridBagConstraints);

        jButton2.setText(NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jButton2, gridBagConstraints);

        jButton3.setText(NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jButton3, gridBagConstraints);

        jButton4.setText(NbBundle.getMessage(ChooseModelVisualPanel.class, "ChooseModelVisualPanel.jButton4.text")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel3.add(jButton4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(filler2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel3, gridBagConstraints);

        jCheckBox1.setText(NbBundle.getMessage(
                ChooseModelVisualPanel.class,
                "ChooseModelVisualPanel.jCheckBox1.text",
                new Object[] {})); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jCheckBox1, gridBagConstraints);
    }                              // </editor-fold>//GEN-END:initComponents

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void jButton5ActionPerformed(final java.awt.event.ActionEvent evt) //GEN-FIRST:event_jButton5ActionPerformed
    {                                                                          //GEN-HEADEREND:event_jButton5ActionPerformed
        final int selI = jXList2.getSelectedIndex();
        if (selI != (jXList2.getElementCount() - 1)) {
            ((DefaultListModel)jXList2.getModel()).add(selI + 1, ((DefaultListModel)jXList2.getModel()).remove(selI));
        }
    }                                                                          //GEN-LAST:event_jButton5ActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void jButton6ActionPerformed(final java.awt.event.ActionEvent evt) //GEN-FIRST:event_jButton6ActionPerformed
    {                                                                          //GEN-HEADEREND:event_jButton6ActionPerformed
        final int selI = jXList2.getSelectedIndex();
        if (selI != 0) {
            ((DefaultListModel)jXList2.getModel()).add(selI - 1, ((DefaultListModel)jXList2.getModel()).remove(selI));
        }
    }                                                                          //GEN-LAST:event_jButton6ActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void jButton1ActionPerformed(final java.awt.event.ActionEvent evt) //GEN-FIRST:event_jButton1ActionPerformed
    {                                                                          //GEN-HEADEREND:event_jButton1ActionPerformed
        final Enumeration<String> en = ((DefaultListModel<String>)jXList1.getModel()).elements();
        while (en.hasMoreElements()) {
            ((DefaultListModel<String>)jXList2.getModel()).addElement(en.nextElement());
        }
    }                                                                          //GEN-LAST:event_jButton1ActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void jButton2ActionPerformed(final java.awt.event.ActionEvent evt) //GEN-FIRST:event_jButton2ActionPerformed
    {                                                                          //GEN-HEADEREND:event_jButton2ActionPerformed
        for (final Object o : jXList1.getSelectedValuesList()) {
            ((DefaultListModel)jXList2.getModel()).addElement(o);
        }
    }                                                                          //GEN-LAST:event_jButton2ActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void jButton3ActionPerformed(final java.awt.event.ActionEvent evt) //GEN-FIRST:event_jButton3ActionPerformed
    {                                                                          //GEN-HEADEREND:event_jButton3ActionPerformed
        for (final Object o : jXList2.getSelectedValuesList()) {
            ((DefaultListModel)jXList2.getModel()).removeElement(o);
        }
    }                                                                          //GEN-LAST:event_jButton3ActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void jButton4ActionPerformed(final java.awt.event.ActionEvent evt) //GEN-FIRST:event_jButton4ActionPerformed
    {                                                                          //GEN-HEADEREND:event_jButton4ActionPerformed
        ((DefaultListModel<String>)jXList2.getModel()).clear();
    }                                                                          //GEN-LAST:event_jButton4ActionPerformed

    //~ Inner Classes ----------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @version  $Revision$, $Date$
     */
    private static final class Percs {

        //~ Instance fields ----------------------------------------------------

        String name;
        long perc;

        //~ Constructors -------------------------------------------------------

        /**
         * Creates a new Percs object.
         *
         * @param  name  DOCUMENT ME!
         * @param  perc  DOCUMENT ME!
         */
        public Percs(final String name, final long perc) {
            this.name = name;
            this.perc = perc;
        }
    }
}
