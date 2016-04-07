package com.Domain.UserActions;

/**
 * Created by student on 2016/04/08.
 */
public class PostActionLike implements PostActionChain{
    private PostActionChain postActionChain;
    @Override
    public void setNextActionChain(PostActionChain postActionChain) {
        this.postActionChain = postActionChain;
    }

    @Override
    public void useraction(PostAction postAction) {
        if(postAction.getAction() =="Like")
        {
            System.out.print("Like event post");
        }
        else
            postActionChain.useraction(postAction);
    }
}
