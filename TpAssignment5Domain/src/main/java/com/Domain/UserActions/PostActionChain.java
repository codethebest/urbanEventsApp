package com.Domain.UserActions;

/**
 * Created by student on 2016/04/08.
 */
public interface PostActionChain {

    public void setNextActionChain (PostActionChain postActionChain);
    public void useraction(PostAction postAction);
}
