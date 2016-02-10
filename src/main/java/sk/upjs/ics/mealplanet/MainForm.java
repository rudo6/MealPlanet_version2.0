package sk.upjs.ics.mealplanet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import sk.upjs.ics.mealplanet.AddForm;
import sk.upjs.ics.mealplanet.DetailForm;
import sk.upjs.ics.mealplanet.MealType;
import sk.upjs.ics.mealplanet.MealTypeDao;
import sk.upjs.ics.mealplanet.MealTypeDaoFactory;
import sk.upjs.ics.mealplanet.Recipe;
import sk.upjs.ics.mealplanet.RecipeDao;
import sk.upjs.ics.mealplanet.RecipeDaoFactory;
import sk.upjs.ics.mealplanet.RelationDao;
import sk.upjs.ics.mealplanet.RelationDaoFactory;

public class MainForm extends javax.swing.JFrame {

    private RecipeDao recipeDao = RecipeDaoFactory.INSTANCE.getRecipeDao();
    private List<MealType> mealTypes = new ArrayList<>();
    private RelationDao relationDao = RelationDaoFactory.INSTANCE.getRelationDao();
    private MealTypeDao mealTypeDao = MealTypeDaoFactory.INSTANCE.getMealTypeDao();
    
    private boolean prihlaseny = false;
    private Long idP = null;
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);     // okno sa otvori v strede obbrazovky   
        this.setMealTypesCombobox();     // do comboboxu nastrka mealtypey (je na to metoda)
        mealTypes = mealTypeDao.getAll(); // ulozime si mealtypey do zoznamu (instancna premenna) aby sme s nimi mohli pracovat
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        headerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foundRecipesList = new javax.swing.JList();
        myRecipesButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        typeComboBox = new javax.swing.JComboBox();
        randomButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteRecipeButton = new javax.swing.JButton();
        prihlasenieButton = new javax.swing.JButton();
        logOffButton = new javax.swing.JButton();
        loggedInTextField = new javax.swing.JTextField();
        isLoggedInLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meal Planet");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        foundRecipesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foundRecipesListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(foundRecipesList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 84, 340, 275));

        myRecipesButton.setText("My recipes");
        myRecipesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRecipesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(myRecipesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 144, -1));
        getContentPane().add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 144, 30));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 144, -1));

        getContentPane().add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 144, 30));

        randomButton.setText("I feel lucky");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(randomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 144, -1));

        addButton.setText("Add recipe");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 144, -1));

        deleteRecipeButton.setText("Delete recipe");
        deleteRecipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecipeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteRecipeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 144, -1));

        prihlasenieButton.setText("Log in");
        prihlasenieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihlasenieButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prihlasenieButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, -1));

        logOffButton.setText("Log off");
        logOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 70, -1));

        loggedInTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(loggedInTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        isLoggedInLabel.setText("is logged in");
        getContentPane().add(isLoggedInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 30));

        registerButton.setText("Register here");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        setBounds(0, 0, 681, 401);
    }// </editor-fold>//GEN-END:initComponents

    private void myRecipesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myRecipesButtonActionPerformed
        if (prihlaseny == false) {
            JOptionPane.showMessageDialog(this, "Nie si prihlaseny");
        } else {
            //List<Recipe> myRecipes = recipeDao.getAll();        //nacitaju sa recepty do zoznamu 
            List<Recipe> myRecipes = recipeDao.getByIdP(idP);
            foundRecipesList.setListData(myRecipes.toArray());  //recepty zo zoznamu "nakreslime" do jListu
        }
    }//GEN-LAST:event_myRecipesButtonActionPerformed
    
    private void setMealTypesCombobox(){
        List<String> mealTypeNames = mealTypeDao.getAllNames();  //nacitaju sa mealtypey do zoznamu
        for (String mealTypeName : mealTypeNames){
            typeComboBox.addItem(mealTypeName);     //iterujeme a pridavame do comboboxu itemy - nazvy mealtypeov
        }
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchedName = searchTextField.getText();  //nazov alebo cast nazvu receptu ktory hladame
        int type = 0; //premenna uchovava typ receptu ktory hladame , defaultne je to nula teda lubovolny typ
        for (MealType mealType : mealTypes) {
            if (mealType.getName().equals(typeComboBox.getSelectedItem())) {
                //z comboboxu zistime aky typ hladame , porovnavame nazovv comboboxe s nazvami mealtypeov a tak zistime
                // ID mealtypeu
                type = mealType.getIdT(); 
            }
        }
        List<Recipe> matchingRecipes = recipeDao.getMatching(searchedName, type); //do listu dame recepty s hladanym menom a typom
        foundRecipesList.setListData(matchingRecipes.toArray());

    }//GEN-LAST:event_searchButtonActionPerformed

    private void foundRecipesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foundRecipesListMouseClicked
        if (evt.getClickCount() == 2) {
            //po dvojkliku sa otvori okno s detailom recpetu do ktoreho posleme aj dany recept
            if (foundRecipesList.getSelectedValue()==null) {
                JOptionPane.showMessageDialog(this, "List receptov je prazdny!");
            } else {
                List<Recipe> recipe = recipeDao.getMatchingName(foundRecipesList.getSelectedValue().toString());
                if (prihlaseny == true) {
                    DetailForm detailForm = new DetailForm(idP);
                    detailForm.setRecipe(recipe.get(0)); //tu posielame recept z mainformu do detailformu
                    detailForm.setVisible(true); //otvori sa okno
                    detailForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                } else {
                    DetailForm detailForm = new DetailForm();
                    detailForm.setRecipe(recipe.get(0)); //tu posielame recept z mainformu do detailformu
                    detailForm.setVisible(true); //otvori sa okno
                    detailForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
            }
        }
    }//GEN-LAST:event_foundRecipesListMouseClicked
    
    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        List<Recipe> myRecipes = recipeDao.getAll(); //nacitame si vsetky recepty z databazy
        List<Recipe> onlyOne = new ArrayList<>(); //list jedneho recptu , preto list aby sme lahko nastavili jList
        int randomNumber = (int) (Math.random() * myRecipes.size()); //nahodne idRecpetu
        onlyOne.add(myRecipes.get(randomNumber)); //pridame do listu recept s tym nahodnym IDckom
        foundRecipesList.setListData(onlyOne.toArray()); //nakreslime do jListu
    }//GEN-LAST:event_randomButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (prihlaseny == false) {
            JOptionPane.showMessageDialog(this, "Nie si prihlaseny");
        } else {
            AddForm addForm = new AddForm(idP); //len sa zobrazi okno na pridanie recptu
            addForm.setVisible(true);
            addForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteRecipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecipeButtonActionPerformed
        if (prihlaseny == false) {
            JOptionPane.showMessageDialog(this, "Nie si prihlaseny");
        } else {
            if (foundRecipesList.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(this, "Nebol zvoleny recept!");
            } else {
                Recipe recipe = recipeDao.getMatchingName(foundRecipesList.getSelectedValue().toString()).get(0); //recept,ktory chceme vymazat
                //vytvorime okno pre potvrdenie vymazania receptu
                if (this.idP == recipe.getIdP()) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure ?", "Watch out", dialogButton);
                    if (dialogResult == 0) {
                        //az ked potvrdime odstranenie recpetu tak sa naozaj vymaze , inak sa nic nestane a recept ostane
                        relationDao.delete(recipe.getIdR());
                        recipeDao.remove(recipe);
                        List<Recipe> myRecipes = recipeDao.getAll();
                        foundRecipesList.setListData(myRecipes.toArray());
                    }
                } else JOptionPane.showMessageDialog(this, "Nemozete zmazat recept ineho usera!");
            }
        }
    }//GEN-LAST:event_deleteRecipeButtonActionPerformed

    private void prihlasenieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihlasenieButtonActionPerformed
        if (prihlaseny == false) {
            LoginForm pf = new LoginForm(this, true);
            pf.setVisible(true);
            this.prihlaseny=pf.getPrihlaseny();
            this.idP=pf.getIdP();
            loggedInTextField.setText(pf.getName());
        }else{
            JOptionPane.showMessageDialog(this, "Pouzivatel je stale prihlaseny!");
        }
    }//GEN-LAST:event_prihlasenieButtonActionPerformed

    private void logOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffButtonActionPerformed
        if(prihlaseny==false){
            JOptionPane.showMessageDialog(this, "Nie si prihlaseny!");
        }else{
            this.prihlaseny=false;
            this.idP=null;
            loggedInTextField.setText("");
            JOptionPane.showMessageDialog(this, "Odhlaseny!");
        }
    }//GEN-LAST:event_logOffButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        RegisterForm rf = new RegisterForm(this, true);
        rf.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteRecipeButton;
    private javax.swing.JList foundRecipesList;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel isLoggedInLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOffButton;
    private javax.swing.JTextField loggedInTextField;
    private javax.swing.JButton myRecipesButton;
    private javax.swing.JButton prihlasenieButton;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JComboBox typeComboBox;
    // End of variables declaration//GEN-END:variables
}
