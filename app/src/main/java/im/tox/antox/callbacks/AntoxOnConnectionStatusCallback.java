package im.tox.antox.callbacks;

import android.content.Context;

import im.tox.antox.AntoxFriend;
import im.tox.jtoxcore.callbacks.OnConnectionStatusCallback;

/**
 * Created by soft on 03/03/14.
 */
public class AntoxOnConnectionStatusCallback implements OnConnectionStatusCallback<AntoxFriend> {

    private Context ctx;

    public AntoxOnConnectionStatusCallback(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public void execute(AntoxFriend friend, boolean online) {

    }
}