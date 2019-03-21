package com.tugasmobile.mynotes;

import com.tugasmobile.mynotes.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
