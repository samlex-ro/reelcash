package com.google.code.reelcash.swing.registry;

import com.google.code.reelcash.data.goods.GoodNode;
import com.google.code.reelcash.data.layout.DataLayoutNode;
import com.google.code.reelcash.data.layout.fields.Field;
import com.google.code.reelcash.data.sql.QueryMediator;
import com.google.code.reelcash.data.taxes.GoodTaxNode;
import com.google.code.reelcash.data.taxes.TaxTypeNode;
import com.google.code.reelcash.swing.FieldDisplay;
import com.google.code.reelcash.swing.FieldDisplayFactory;
import com.google.code.reelcash.swing.JRegistryPanel;
import java.sql.SQLException;

/**
 * Insert some documentation for the class <b>GoodTaxesPanel</b> (what's its purpose,
 * why this implementation, that sort of thing).
 *
 * @author andrei.olar
 */
public class GoodTaxesPanel extends JRegistryPanel {

    private static final long serialVersionUID = 684489874218839412L;
    private GoodTaxDisplayFactory instance;

    @Override
    public DataLayoutNode getDataLayoutNode() {
        return GoodTaxNode.getInstance();
    }

    @Override
    public FieldDisplayFactory getDisplayInfoFactory() {
        if (null == instance)
            instance = new GoodTaxDisplayFactory();
        return instance;
    }

    private class GoodTaxDisplayFactory extends FieldDisplayFactory {

        {
            GoodTaxNode node = GoodTaxNode.getInstance();
            addFieldDisplayInfo(node.getIdField()).setVisible(false);
            
            QueryMediator mediator = new QueryMediator(getDataSource());
            Field field = node.getGoodIdField();
            FieldDisplay display = addFieldDisplayInfo(node.getGoodIdField());
            try {
                GoodNode foreignNode = GoodNode.getInstance();
                initializeReferencedData(foreignNode, foreignNode.getCodeField(), mediator, display, field);
            }
            catch (SQLException e) {
                showError(e);
            }
            field = node.getTaxTypeIdField();
            display = addFieldDisplayInfo(node.getTaxTypeIdField());
            try {
                TaxTypeNode foreignNode = TaxTypeNode.getInstance();
                initializeReferencedData(foreignNode, foreignNode.getCodeField(), mediator, display, field);
            }
            catch (SQLException e) {
                showError(e);
            }
        }

        @Override
        public FieldDisplay getUIDisplayInfo(Field field) {
            return getData().get(field);
        }
    }
}
