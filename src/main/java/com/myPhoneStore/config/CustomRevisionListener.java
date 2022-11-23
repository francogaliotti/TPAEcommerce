package com.myPhoneStore.config;

import com.myPhoneStore.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;



public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
