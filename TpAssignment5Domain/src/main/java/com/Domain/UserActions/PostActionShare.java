package com.Domain.UserActions;

/**
 * Created by student on 2016/04/08.
 */
public class PostActionShare implements PostActionChain{

    private PostActionChain postActionChain;
    @Override
    public void setNextActionChain(PostActionChain postActionChain) {
        this.postActionChain = postActionChain;
    }

    @Override
    public void useraction(PostAction postAction) {
        if(postAction.getAction() =="Share")
        {
            System.out.print("I Share event post");
        }
        else
            System.out.print("No action to the Event Post");
    }
}
