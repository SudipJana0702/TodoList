// Generated by view binder compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todolist.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ExtendedFloatingActionButton newTaskButton;

  @NonNull
  public final RecyclerView todoListRecyclerView;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull ExtendedFloatingActionButton newTaskButton,
      @NonNull RecyclerView todoListRecyclerView) {
    this.rootView = rootView;
    this.newTaskButton = newTaskButton;
    this.todoListRecyclerView = todoListRecyclerView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.newTaskButton;
      ExtendedFloatingActionButton newTaskButton = ViewBindings.findChildViewById(rootView, id);
      if (newTaskButton == null) {
        break missingId;
      }

      id = R.id.todoListRecyclerView;
      RecyclerView todoListRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (todoListRecyclerView == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, newTaskButton,
          todoListRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
