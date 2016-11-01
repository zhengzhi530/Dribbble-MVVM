package com.adgvcxz.adgble.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableLong;
import android.view.View;
import android.widget.Toast;

import com.adgvcxz.adgble.binding.ViewBindingConfig;
import com.adgvcxz.adgble.content.Comment;
import com.adgvcxz.adgble.util.ObservableString;

import java.util.Date;

/**
 * zhaowei
 * Created by zhaowei on 2016/10/31.
 */

public class CommentViewModel extends BaseObservable {

    public final ObservableLong userId;
    public final ObservableString username;
    public final ObservableString avatar;
    public final ObservableString body;
    public final ObservableInt likesCount;
    public final ObservableField<Date> createdAt;
    public final ObservableInt anim;

    public CommentViewModel(Comment comment) {
        userId = new ObservableLong(comment.user.id);
        username = new ObservableString(comment.user.username);
        avatar = new ObservableString(comment.user.avatarUrl);
        body = new ObservableString(comment.body);
        likesCount = new ObservableInt(comment.likesCount);
        createdAt = new ObservableField<>(comment.createdAt);
        anim = new ObservableInt(ViewBindingConfig.AnimInit);
    }

    public final View.OnClickListener clickLike = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Click Like", Toast.LENGTH_SHORT).show();
        }
    };
    public final View.OnClickListener clickReply = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Click Reply", Toast.LENGTH_SHORT).show();
        }
    };
    public final View.OnClickListener clickCopy = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Click Copy", Toast.LENGTH_SHORT).show();
        }
    };
}
