package com.v2soft.AndLib.communications;

import java.io.Serializable;

/**
 * 
 * @author vshcryabets@gmail.com
 *
 * @param <U> communication user data type
 * @param <ID> message ID
 */
public class AbstractCommunicationMessage<U extends AbstractCommunicationUser<?>, MID> 
    implements Serializable {
    private static final long serialVersionUID = 2L;
    protected MID mId;
    protected U mSender;
    protected U mRecepient;
    protected boolean isRead;
    
    public AbstractCommunicationMessage() {
        isRead = false;
    }
    /**
     * @return the mId
     */
    public MID getId() {
        return mId;
    }
    /**
     * @return the mSender
     */
    public U getSender() {
        return mSender;
    }
    /**
     * @return the mRecepient
     */
    public U getRecepient() {
        return mRecepient;
    }
    /**
     * @param mId the mId to set
     */
    public void setId(MID mId) {
        this.mId = mId;
    }
    /**
     * @param mSender the mSender to set
     */
    public void setSender(U mSender) {
        this.mSender = mSender;
    }
    /**
     * @param mRecepient the mRecepient to set
     */
    public void setRecepient(U mRecepient) {
        this.mRecepient = mRecepient;
    }
    /**
     * 
     * @return true if this message marked as read
     */
    public boolean isRead() {
        return isRead;
    }
    /**
     * 
     * @param isRead should be true if this message marked as read
     */
    protected void setRead(boolean isRead) {
        this.isRead = isRead;
    };
    
    @Override
    public int hashCode() {
        return mId.hashCode();
    }
    
    public boolean equals(Object o) {
        if ( o == null ) {
            return false;
        }
        if ( o instanceof AbstractCommunicationMessage) {
            AbstractCommunicationMessage<?, ?> msg = (AbstractCommunicationMessage<?, ?>) o;
            return mId.equals(msg.mId);
        }
        return false;
    }

}
