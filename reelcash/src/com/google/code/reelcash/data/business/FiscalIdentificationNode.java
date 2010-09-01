package com.google.code.reelcash.data.business;

import com.google.code.reelcash.data.KeyRole;
import com.google.code.reelcash.data.layout.LeafLayoutNode;
import com.google.code.reelcash.data.layout.fields.IntegerField;
import com.google.code.reelcash.data.layout.fields.ReferenceField;
import com.google.code.reelcash.data.layout.fields.StringField;

/**
 *
 * @author andrei.olar
 */
public class FiscalIdentificationNode extends LeafLayoutNode {

    private static final Object SYNC_ROOT = new Object();
    private static final String TABLE_NAME = "fiscal_identification";
    private static FiscalIdentificationNode instance;

    private FiscalIdentificationNode() {
        super(BusinessNode.getInstance(), TABLE_NAME);
        getFieldList().add(new IntegerField("id", KeyRole.PRIMARY, true));
        getFieldList().add(new ReferenceField(BusinessNode.getInstance().getIdField(), "business_id"));
        getFieldList().add(new StringField("name", KeyRole.NONE, true));
        getFieldList().add(new StringField("value", KeyRole.NONE, true));
    }

    public static FiscalIdentificationNode getInstance() {
        synchronized (SYNC_ROOT) {
            if (null == instance)
                instance = new FiscalIdentificationNode();
        }
        return instance;
    }

    public IntegerField getIdField() {
        return (IntegerField) getFieldList().get(0);
    }

    public ReferenceField getBusinessIdField() {
        return (ReferenceField) getFieldList().get(1);
    }

    public StringField getNameField() {
        return (StringField) getFieldList().get(2);
    }

    public StringField getValueField() {
        return (StringField) getFieldList().get(3);
    }
}
