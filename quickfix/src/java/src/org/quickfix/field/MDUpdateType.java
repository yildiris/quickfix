package org.quickfix.field; 
import org.quickfix.IntField; 
import java.util.Date; 

public class MDUpdateType extends IntField 
{ 
  public static final int FIELD = 265; 
public static final int FULL = 0; 
public static final int INCREMENTAL = 1; 

  public MDUpdateType() 
  { 
    super(265);
  } 
  public MDUpdateType(int data) 
  { 
    super(265, data);
  } 
} 
