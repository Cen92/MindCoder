package main.tl.tree.functions;

import java.io.PrintStream;

import com.example.antlrtest.BluetoothManager;

import main.tl.TLValue;
import main.tl.tree.TLNode;

public class TurnLeftNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public TurnLeftNode(TLNode e) {
    this(e, System.out);
  }

  public TurnLeftNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    
    TLValue value = expression.evaluate();
    out.println("0x0c 0x00  0x80  0x04  0x02  0x64  0x07  0x00  0x00  0x20  0x00  0x00  0x00  0x87");
    BluetoothManager instance = BluetoothManager.getInstance();
    byte [] turnLeft = {0x0c,0x00,(byte)0x80,0x04,0x02,0x64,0x07,0x00,0x00,0x20,0x00,0x00,0x00,(byte)0x87};
    instance.addToArray(turnLeft);
    return TLValue.VOID;
  }
}

