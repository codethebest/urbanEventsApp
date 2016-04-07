package com.Domain.UserActions;

/**
 * Created by student on 2016/04/08.
 */
public class PostActionInterested implements PostActionChain {

    private PostActionChain postActionChain;
    @Override
    public void setNextActionChain(PostActionChain postActionChain) {
        this.postActionChain = postActionChain;
    }

    @Override
    public void useraction(PostAction postAction) {
        if(postAction.getAction() =="Interested")
        {
            System.out.print("Am interested in the event");
        }
        else
            postActionChain.useraction(postAction);
    }
}
