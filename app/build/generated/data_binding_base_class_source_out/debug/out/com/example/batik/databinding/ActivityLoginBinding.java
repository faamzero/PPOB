// Generated by view binder compiler. Do not edit!
package com.example.batik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.batik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText emailLog;

  @NonNull
  public final EditText passwordLog;

  @NonNull
  public final TextView tvDaftar;

  @NonNull
  public final TextView tvLoginAwal;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull EditText emailLog, @NonNull EditText passwordLog, @NonNull TextView tvDaftar,
      @NonNull TextView tvLoginAwal) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.emailLog = emailLog;
    this.passwordLog = passwordLog;
    this.tvDaftar = tvDaftar;
    this.tvLoginAwal = tvLoginAwal;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = rootView.findViewById(id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.email_log;
      EditText emailLog = rootView.findViewById(id);
      if (emailLog == null) {
        break missingId;
      }

      id = R.id.password_log;
      EditText passwordLog = rootView.findViewById(id);
      if (passwordLog == null) {
        break missingId;
      }

      id = R.id.tv_daftar;
      TextView tvDaftar = rootView.findViewById(id);
      if (tvDaftar == null) {
        break missingId;
      }

      id = R.id.tv_login_awal;
      TextView tvLoginAwal = rootView.findViewById(id);
      if (tvLoginAwal == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, emailLog, passwordLog,
          tvDaftar, tvLoginAwal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}