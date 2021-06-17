package com.TypeWriter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.appinventor.components.annotations.*;
import android.widget.FrameLayout;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.*;
@DesignerComponent(
        version = 1,
        description = "TypeWriter View",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")
@SimpleObject(external = true)
public class TypeWriter extends AndroidNonvisibleComponent {
    private Context context;
    private TypeWriterView typeWriterView;
    private Activity activity;
    public TypeWriter(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }
    @SimpleFunction
    public void MakeTypeWrite(AndroidViewComponent androidViewComponent, int delay, String string){  
         FrameLayout frameLayout = (FrameLayout) androidViewComponent.getView();
         TypeWriterView typeWriterView = new TypeWriterView(this.context); 
         //Setting each character animation delay
         typeWriterView.setDelay(delay);
         //Animating Text
         typeWriterView.animateText(string);
         frameLayout.addView(typeWriterView, new FrameLayout.LayoutParams(-1, -1));
    }
    @SimpleFunction
    public void RemoveTypeWriter(){
         typeWriterView.removeAnimation();
    }
}