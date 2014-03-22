package main.tl.tree.functions;

import java.io.PrintStream;

import com.example.antlrtest.BluetoothManager;

import main.tl.TLValue;
import main.tl.tree.TLNode;

public class MoveBackwardNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public MoveBackwardNode(TLNode e) {
    this(e, System.out);
  }

  public MoveBackwardNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    
    TLValue value = expression.evaluate();
    out.println("0x0c 0x00  0x80  0x04  0x02  0x9C  0x07  0x00  0x00  0x20  0x00  0x00  0x02  0xD0" + value);
    BluetoothManager instance = BluetoothManager.getInstance();
    byte [] moveBackward = {0x0c,0x00,  (byte)0x80,  0x04,  0x02,  (byte)0x9C,  0x07,  0x00,  0x00,  0x20,  0x00,  0x00,  0x02,  (byte)0xD0};

    return TLValue.VOID;
  }
}
