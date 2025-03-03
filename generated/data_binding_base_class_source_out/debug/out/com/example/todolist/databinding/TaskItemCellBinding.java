// Generated by view binder compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todolist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TaskItemCellBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageButton completeButton;

  @NonNull
  public final TextView dueTime;

  @NonNull
  public final TextView name;

  @NonNull
  public final CardView taskCellContainer;

  private TaskItemCellBinding(@NonNull CardView rootView, @NonNull ImageButton completeButton,
      @NonNull TextView dueTime, @NonNull TextView name, @NonNull CardView taskCellContainer) {
    this.rootView = rootView;
    this.completeButton = completeButton;
    this.dueTime = dueTime;
    this.name = name;
    this.taskCellContainer = taskCellContainer;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static TaskItemCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TaskItemCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.task_item_cell, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TaskItemCellBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.completeButton;
      ImageButton completeButton = ViewBindings.findChildViewById(rootView, id);
      if (completeButton == null) {
        break missingId;
      }

      id = R.id.dueTime;
      TextView dueTime = ViewBindings.findChildViewById(rootView, id);
      if (dueTime == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      CardView taskCellContainer = (CardView) rootView;

      return new TaskItemCellBinding((CardView) rootView, completeButton, dueTime, name,
          taskCellContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
