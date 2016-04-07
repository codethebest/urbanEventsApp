package com.Domain;


import com.Domain.UserActions.*;
import org.junit.Test;

/**
 * Created by student on 2016/04/08.
 */
public class TestUserAction {

    @Test
    public static void main(String []args) {
    PostActionChain postActionChain1 = new PostActionInterested();
    PostActionChain postActionChain2 = new PostActionLike();
    PostActionChain postActionChain3 = new PostActionShare();

    postActionChain1.setNextActionChain(postActionChain2);
    postActionChain2.setNextActionChain(postActionChain3);

    PostAction postAction = new PostAction("Like");

    postActionChain1.useraction(postAction);
}

}
