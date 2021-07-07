package com.TypeWriter;

public interface TypeWriterListener {
   public void onTypingStart(String text);

   public void onTypingEnd(String text);

   public void onCharacterTyped(String text, int position);

   public void onTypingRemoved(String text);
}
