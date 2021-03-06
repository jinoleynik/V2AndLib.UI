/*
 * Copyright (C) 2013 V.Shcryabets (vshcryabets@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.v2soft.AndLib.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import com.v2soft.AndLib.ui.R;

/**
 * Simple error dialog fragment
 * @author vshcryabets@gmail.coms
 *
 */
public class ErrorDialogFragment extends DialogFragment {
    protected static final String LOG_TAG = ErrorDialogFragment.class.getSimpleName();
    private static final String EXTRA_TITLE = "title";
    private static final String EXTRA_MESSAGE = "message";

    public static ErrorDialogFragment newInstance(String title, String message) {
        final Bundle args = new Bundle();
        args.putString(EXTRA_TITLE, title);
        args.putString(EXTRA_MESSAGE, message);
        ErrorDialogFragment frg =  new ErrorDialogFragment();
        frg.setArguments(args);
        return frg;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(getActivity())
        .setMessage(getArguments().getString(EXTRA_MESSAGE))
        .setCancelable(true)
        .setTitle(getArguments().getString(EXTRA_TITLE))
        .setPositiveButton(R.string.v2andlib_btn_ok, null);
        return alertDialogBuilder.create();
    }
}
