package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class NotesText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_text);

        EditText editText = findViewById(R.id.notesId);

        Intent intent = getIntent();
        final int noteId = intent.getIntExtra("noteId",-1);

        if (noteId != -1) {
            editText.setText(MH5.notes.get(noteId));
        } //else {
          //  MH5.notes.add("");
          //  noteId = MH5.notes.size() - 1;
       // }
    editText.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            MH5.notes.set(noteId, String.valueOf(s));
            MH5.arrayAdapter.notifyDataSetChanged();


        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    });
    }
}