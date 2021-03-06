package acousticfield3d.gui;

import acousticfield3d.math.M;
import acousticfield3d.math.Vector2f;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.FileUtils;
import acousticfield3d.utils.Parse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asier
 */
public class HoloPatternsForm extends javax.swing.JFrame {
    private final MainForm form;
    private final ArrayList<Float> mPhases;
    
    enum BasicOperation{
        opSet, opAdd, opSus
    };
    
    public HoloPatternsForm(MainForm form) {
        this.form = form;
        mPhases = new ArrayList<>();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patternsGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        phaseNormalizationGroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        frText = new javax.swing.JTextField();
        helicalCheck = new javax.swing.JRadioButton();
        gridCheck = new javax.swing.JRadioButton();
        setButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        sustractButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        mSetButton = new javax.swing.JButton();
        mAddButton = new javax.swing.JButton();
        mSustractButton = new javax.swing.JButton();
        gaussianAmpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        varText = new javax.swing.JTextField();
        savePhasesButton = new javax.swing.JButton();
        loadPhasesButton = new javax.swing.JButton();
        onlySelectionCheck = new javax.swing.JCheckBox();
        uniformPhaseButton = new javax.swing.JButton();
        moduleText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radialCheck = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        offsetText = new javax.swing.JTextField();
        halfSplitCheck = new javax.swing.JCheckBox();
        normalizePhaseButton = new javax.swing.JButton();
        phaseNorFirstCheck = new javax.swing.JRadioButton();
        phaseNorMinCheck = new javax.swing.JRadioButton();
        phaseNorValCheck = new javax.swing.JRadioButton();
        phaseNorText = new javax.swing.JTextField();
        phaseNorNoneCheck = new javax.swing.JRadioButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HoloPatterns");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setText("fr:");

        frText.setText("1");

        patternsGroup.add(helicalCheck);
        helicalCheck.setSelected(true);
        helicalCheck.setText("helical");

        patternsGroup.add(gridCheck);
        gridCheck.setText("HGrid");

        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        sustractButton.setText("Sustract");
        sustractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sustractButtonActionPerformed(evt);
            }
        });

        mButton.setText("M");
        mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });

        mSetButton.setText("Set");
        mSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSetButtonActionPerformed(evt);
            }
        });

        mAddButton.setText("Add");
        mAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAddButtonActionPerformed(evt);
            }
        });

        mSustractButton.setText("Sustract");
        mSustractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSustractButtonActionPerformed(evt);
            }
        });

        gaussianAmpButton.setText("Gaussian Amp");
        gaussianAmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaussianAmpButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("var");

        varText.setText("0.2");

        savePhasesButton.setText("save");
        savePhasesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePhasesButtonActionPerformed(evt);
            }
        });

        loadPhasesButton.setText("load");
        loadPhasesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPhasesButtonActionPerformed(evt);
            }
        });

        onlySelectionCheck.setText("only selected");

        uniformPhaseButton.setText("UniformPhase");
        uniformPhaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniformPhaseButtonActionPerformed(evt);
            }
        });

        moduleText.setText("1");

        jLabel3.setText("m:");

        patternsGroup.add(radialCheck);
        radialCheck.setText("radial");

        jLabel4.setText("offset:");

        offsetText.setText("0");

        halfSplitCheck.setText("HalfSplit");

        normalizePhaseButton.setText("NormalizePhase");
        normalizePhaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalizePhaseButtonActionPerformed(evt);
            }
        });

        phaseNormalizationGroup.add(phaseNorFirstCheck);
        phaseNorFirstCheck.setSelected(true);
        phaseNorFirstCheck.setText("first");

        phaseNormalizationGroup.add(phaseNorMinCheck);
        phaseNorMinCheck.setText("min");

        phaseNormalizationGroup.add(phaseNorValCheck);
        phaseNorValCheck.setText("val");

        phaseNorText.setText("0.3");

        phaseNormalizationGroup.add(phaseNorNoneCheck);
        phaseNorNoneCheck.setText("none");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gaussianAmpButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(savePhasesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadPhasesButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moduleText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sustractButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mSetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mSustractButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phaseNorNoneCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phaseNorFirstCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phaseNorMinCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phaseNorValCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phaseNorText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(onlySelectionCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uniformPhaseButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(normalizePhaseButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(offsetText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(helicalCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gridCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radialCheck)))
                                .addGap(10, 10, 10)
                                .addComponent(halfSplitCheck)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(frText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(moduleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(offsetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(halfSplitCheck))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helicalCheck)
                    .addComponent(gridCheck)
                    .addComponent(radialCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onlySelectionCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setButton)
                    .addComponent(addButton)
                    .addComponent(sustractButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mButton)
                    .addComponent(mSetButton)
                    .addComponent(mAddButton)
                    .addComponent(mSustractButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savePhasesButton)
                    .addComponent(loadPhasesButton))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uniformPhaseButton)
                    .addComponent(normalizePhaseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phaseNorFirstCheck)
                    .addComponent(phaseNorMinCheck)
                    .addComponent(phaseNorValCheck)
                    .addComponent(phaseNorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phaseNorNoneCheck))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gaussianAmpButton)
                    .addComponent(jLabel1)
                    .addComponent(varText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setHoloMemory(float[] phases){
        if (phases != null){
            mPhases.clear();
            for(float phase : phases){
                mPhases.add( phase );
            }
        }
    }
    
    public float[] getHoloMemory(){
        final int size = mPhases.size();
        final float[] phases = new float[ size ];
        for(int i = 0; i < size; ++i){
            phases[i] = mPhases.get(i);
        }
        return phases;
    }
    
    private void applyOpToArray(BasicOperation o){
        Vector3f min = new Vector3f(), max = new Vector3f();
        
        ArrayList<Transducer> ts;
        if (onlySelectionCheck.isSelected()){
            ts = new ArrayList<>();
            for(Entity e : form.getSelection()){
                if (e instanceof Transducer){
                    ts.add( (Transducer) e);
                }
            }
        }else{
            ts = form.simulation.getTransducers();
        }
       
        
        Scene.calcBoundaries(ts, min, max);
        final Vector3f size = max.subtract( min );
        final Vector3f center = max.add(min).divideLocal( 2 );
        
        final float fr = Parse.toFloat( frText.getText() );
        final float m = Parse.toFloat( moduleText.getText() );
        final float offset = Parse.toFloat( offsetText.getText() );
        final boolean halfSplit = halfSplitCheck.isSelected();
        
        
        for(Transducer t : ts){
            final Vector3f pos = t.getTransform().getTranslation();
            final Vector3f npos3 = pos.subtract( center ).divideLocal( size );
            final Vector2f p = new Vector2f( npos3.x, npos3.z);
            
            float value = 0;
            if (helicalCheck.isSelected()){
                final int mp = (int) (p.length() * m);
                final float revOffset = mp % 2 == 0 ? 0 : M.PI;
                value =  ( (( p.getAngle() - revOffset + offset) * fr / M.PI) ) % 2.0f;
                if (halfSplit){ 
                    if (value >= 0.0f && value <= 1.0f) { value = 0.0f;}
                    else { value = 1.0f; }
                }
            }else if(gridCheck.isSelected()){
                value = 2.0f * M.sin(M.TWO_PI * p.x * fr);
            }else if(radialCheck.isSelected()){
                value = (p.length() * m) % m;
            }
            applyToTransducer(t, value, o);
        }
        
        
    }
    
    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        applyOpToArray(BasicOperation.opSet);
        form.needUpdate();
    }//GEN-LAST:event_setButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        applyOpToArray(BasicOperation.opAdd);
        form.needUpdate();
    }//GEN-LAST:event_addButtonActionPerformed

    public void addMemorizedHoloPattern(){
        applyMemory(BasicOperation.opAdd);
        form.needUpdate();
    }
    
    public void addCurrentPattern(){
        applyOpToArray(BasicOperation.opAdd);
        form.needUpdate();
    }
    
    private void sustractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sustractButtonActionPerformed
        applyOpToArray(BasicOperation.opSus);
        form.needUpdate();
    }//GEN-LAST:event_sustractButtonActionPerformed

    public void memorizePattern(){
        mPhases.clear();
        final ArrayList<Transducer> ts = form.simulation.getTransducers();
        for(Transducer t : ts){
            mPhases.add( t.getPhase() );
        }
    }
    
    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonActionPerformed
        memorizePattern();
    }//GEN-LAST:event_mButtonActionPerformed

    private void applyToTransducer(Transducer t, float phase, BasicOperation o){
        if(o == BasicOperation.opSet){
            t.setPhase( phase );
        }else if(o == BasicOperation.opAdd){
            t.setPhase( t.getPhase() + phase );
        }else if(o == BasicOperation.opSus){
            t.setPhase( t.getPhase() - phase );
        }
    }
    
    private void applyMemory(BasicOperation o){
        final ArrayList<Transducer> ts = form.simulation.getTransducers();
        
        final int n = mPhases.size();
        int index = 0;
        for(Transducer t : ts){
            if (index < n){
                applyToTransducer(t, mPhases.get(index), o);
                index++;
            }else{
                break;
            } 
        }
    }
    
    private void mSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSetButtonActionPerformed
        applyMemory(BasicOperation.opSet);
        form.needUpdate();
    }//GEN-LAST:event_mSetButtonActionPerformed

    private void mAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAddButtonActionPerformed
        applyMemory(BasicOperation.opAdd);
        form.needUpdate();
    }//GEN-LAST:event_mAddButtonActionPerformed

    private void mSustractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSustractButtonActionPerformed
        applyMemory(BasicOperation.opSus);
        form.needUpdate();
    }//GEN-LAST:event_mSustractButtonActionPerformed

    public void subtractFromHoloMemory(){
        applyMemory(BasicOperation.opSus);
        form.needUpdate();
    }
    
    private void gaussianAmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaussianAmpButtonActionPerformed
        Vector3f min = new Vector3f(), max = new Vector3f();
        
        final ArrayList<Transducer> ts = form.simulation.getTransducers();
        
        Scene.calcBoundaries(ts, min, max);
        final Vector3f size = max.subtract( min );
        final Vector3f center = max.add(min).divideLocal( 2 );
        
        
        final float var = Parse.toFloat( varText.getText() );
        for(Transducer t : ts){
            final Vector3f pos = t.getTransform().getTranslation();
            final Vector3f npos3 = pos.subtract( center ).divideLocal( size );
            final Vector2f p = new Vector2f( npos3.x, npos3.z);

            float a = 1.0f / M.sqrt(M.TWO_PI * var);
            float b = 0.0f;
            float c = M.sqrt(var);

            float dist = p.length();
            float gaussian = a * M.exp(- (M.sqr(dist-b) / (2.0f*c*c)));
            t.setpAmplitude(gaussian);
        }
        
        form.needUpdate();
    }//GEN-LAST:event_gaussianAmpButtonActionPerformed

    public void uniformPhase(){
        final ArrayList<Transducer> ts = form.simulation.getTransducers();
        for(Transducer t : ts){
            float phase = t.getPhase();
            while(phase < 0.0f){
                phase += 2.0f;
            }
            t.setPhase(phase);
        }
    }
    
    public void normalizePhase(){
        final ArrayList<Transducer> ts = form.simulation.getTransducers();
        float phaseToSubtract = 0.0f;
        if (phaseNorFirstCheck.isSelected()){
            phaseToSubtract = ts.get(0).getPhase();
        }else if(phaseNorMinCheck.isSelected()){
            phaseToSubtract = Float.MAX_VALUE;
            for(Transducer t : ts){
                phaseToSubtract = M.min(t.getPhase(), phaseToSubtract);
            }
        }else if(phaseNorValCheck.isSelected()){
            phaseToSubtract = Parse.toFloat( phaseNorText.getText() );
        }else if(phaseNorNoneCheck.isSelected()){
            return;
        }

        for(Transducer t : ts){
            t.setPhase( t.getPhase() - phaseToSubtract );
        }
    }
    
    private void uniformPhaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniformPhaseButtonActionPerformed
        uniformPhase();
        form.needUpdate();
    }//GEN-LAST:event_uniformPhaseButtonActionPerformed

    private void savePhasesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePhasesButtonActionPerformed
        String path = FileUtils.selectNonExistingFile(this, ".txt");
        if(path != null){
            try {
                FileUtils.writeBytesInFile(new File(path), Parse.printFloats(mPhases).getBytes() );
            } catch (IOException ex) {
                Logger.getLogger(HoloPatternsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_savePhasesButtonActionPerformed

    private void loadPhasesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPhasesButtonActionPerformed
        String path = FileUtils.selectFile(this, "open", ".txt", null);
        if(path != null){
            try {
                String content = new String( FileUtils.getBytesFromFile(new File(path)) );
                mPhases.clear();
                mPhases.addAll( Parse.parseFloats(content) );
            } catch (IOException ex) {
                Logger.getLogger(HoloPatternsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_loadPhasesButtonActionPerformed

    private void normalizePhaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalizePhaseButtonActionPerformed
        normalizePhase();
        form.needUpdate();
    }//GEN-LAST:event_normalizePhaseButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible( false );
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField frText;
    private javax.swing.JButton gaussianAmpButton;
    private javax.swing.JRadioButton gridCheck;
    private javax.swing.JCheckBox halfSplitCheck;
    private javax.swing.JRadioButton helicalCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loadPhasesButton;
    private javax.swing.JButton mAddButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton mSetButton;
    private javax.swing.JButton mSustractButton;
    private javax.swing.JTextField moduleText;
    private javax.swing.JButton normalizePhaseButton;
    private javax.swing.JTextField offsetText;
    private javax.swing.JCheckBox onlySelectionCheck;
    private javax.swing.ButtonGroup patternsGroup;
    private javax.swing.JRadioButton phaseNorFirstCheck;
    private javax.swing.JRadioButton phaseNorMinCheck;
    private javax.swing.JRadioButton phaseNorNoneCheck;
    private javax.swing.JTextField phaseNorText;
    private javax.swing.JRadioButton phaseNorValCheck;
    private javax.swing.ButtonGroup phaseNormalizationGroup;
    private javax.swing.JRadioButton radialCheck;
    private javax.swing.JButton savePhasesButton;
    private javax.swing.JButton setButton;
    private javax.swing.JButton sustractButton;
    private javax.swing.JButton uniformPhaseButton;
    private javax.swing.JTextField varText;
    // End of variables declaration//GEN-END:variables
}
