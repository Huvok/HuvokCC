/* Generated By:JJTree&JavaCC: Do not edit this line. SyntaxTokenManager.java */
import java.io.*;
import java.util.*;

/** Token Manager. */
public class SyntaxTokenManager implements SyntaxConstants
{
    static int linenumber = 0;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x6fc01c01ffc0L) != 0L)
         {
            jjmatchedKind = 51;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x240000003000L) != 0L)
            return 2;
         if ((active0 & 0x4bc01c01cfc0L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x80004010080L) != 0L)
            return 2;
         if ((active0 & 0x43c01800cf40L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x408000000500L) != 0L)
            return 2;
         if ((active0 & 0x3401800ca40L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x2400000c800L) != 0L)
            return 2;
         if ((active0 & 0x10018000200L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
            return 2;
         }
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x10008000200L) != 0L)
            return 2;
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 5;
            return 2;
         }
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x10000000L) != 0L)
            return 2;
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x40L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 2);
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 33:
         jjmatchedKind = 49;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 40:
         return jjStopAtPos(0, 19);
      case 41:
         return jjStopAtPos(0, 20);
      case 42:
         return jjStopAtPos(0, 32);
      case 43:
         return jjStopAtPos(0, 30);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         return jjStopAtPos(0, 31);
      case 47:
         return jjStopAtPos(0, 33);
      case 58:
         return jjStopAtPos(0, 23);
      case 59:
         return jjStopAtPos(0, 25);
      case 60:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 62:
         return jjStopAtPos(0, 35);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x3000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x10000004000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x8000800L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x4000008000L);
      case 91:
         return jjStopAtPos(0, 21);
      case 93:
         return jjStopAtPos(0, 22);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200004000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 123:
         return jjStopAtPos(0, 17);
      case 124:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 125:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 38:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         break;
      case 61:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000400L);
      case 102:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 45, 2);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x30000008000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000014200L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 111:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 42, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x80010000100L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 115:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 2);
         break;
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 124:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x18000004400L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x8200L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x24000000000L);
      case 108:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 2);
         break;
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000800L);
      case 114:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 43, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000100L);
      case 116:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 101:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 2);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8004000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x20010000040L);
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000008000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 2);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 2);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 41, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000200L);
      case 109:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 2);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 2);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 40, 2);
         break;
      case 103:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 110:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 28, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa11_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(11, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 8;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 5:
                  jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if (curChar == 34 && kind > 52)
                     kind = 52;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(2);
                  break;
               case 4:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   4, 6, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, 
"\143\141\154\154\40\142\141\156\156\145\162\163", "\166\141\156", "\150\157\163\164", "\160\154\145\144\147\145", 
"\162\145\141\162", "\123\143\157\165\164", "\101\164", "\101\163", "\103\154\141\151\155", 
"\127\150\145\162\145", "\141\154\154", "\173", "\175", "\50", "\51", "\133", "\135", "\72", "\54", 
"\73", "\151\156\164", "\123\164\162\151\156\147", "\142\157\157\154\145\141\156", 
"\74\75", "\53", "\55", "\52", "\57", "\74", "\76", "\75\75", "\41\75", 
"\127\162\151\164\145", "\122\145\141\144", "\103\150\141\162\147\145", "\167\150\151\154\145", 
"\144\157", "\146\157\162", "\174", "\151\146", "\145\154\163\145", "\174\174", "\46\46", 
"\41", null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffffffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[8];
static private final int[] jjstateSet = new int[16];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public SyntaxTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public SyntaxTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 8; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 2 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          linenumber++;
         break;
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 6 :
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
                                       System.out.println("CALL -> " + image);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                             System.out.println("VAN -> " + image);
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                       System.out.println("HOST -> " + image);
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                           System.out.println("PLEDGE -> " + image);
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                       System.out.println("REAR -> " + image);
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                                 System.out.println("SCOUT -> " + image);
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                           System.out.println("AT -> " + image);
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                   System.out.println("AS -> " + image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                         System.out.println("CLAIM -> " + image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                         System.out.println("WHERE -> " + image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                     System.out.println("ALL -> " + image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                              System.out.println("LBRACE -> " + image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                              System.out.println("RBRACE -> " + image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                            System.out.println("LPAR -> " + image);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                            System.out.println("RPAR -> " + image);
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                       System.out.println("LSQUARE -> " + image);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                               System.out.println("RSQUARE -> " + image);
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                                   System.out.println("DOUBLECOLON -> " + image);
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                             System.out.println("COMMA -> " + image);
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                                 System.out.println("SEMICOLON -> " + image);
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                             System.out.println("INT -> " + image);
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                           System.out.println("STRING -> " + image);
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                             System.out.println("BOOLEAN -> " + image);
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                                    System.out.println("ASSIGNATION -> " + image + "\u005cr\u005cn");
         break;
      case 30 :
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                            System.out.println("PLUS -> " + image);
         break;
      case 31 :
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                     System.out.println("MINUS -> " + image);
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                    System.out.println("MULT -> " + image);
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
                   System.out.println("DIV -> " + image);
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
                        System.out.println("LESSTHAN -> " + image);
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                        System.out.println("MORETHAN -> " + image);
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                       System.out.println("EQUALS -> " + image);
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                          System.out.println("NOTEQUALS -> " + image);
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
                                 System.out.println("WRITE -> " + image);
         break;
      case 39 :
        image.append(jjstrLiteralImages[39]);
        lengthOfMatch = jjstrLiteralImages[39].length();
                       System.out.println("READ -> " + image);
         break;
      case 40 :
        image.append(jjstrLiteralImages[40]);
        lengthOfMatch = jjstrLiteralImages[40].length();
                           System.out.println("CHARGE -> " + image);
         break;
      case 41 :
        image.append(jjstrLiteralImages[41]);
        lengthOfMatch = jjstrLiteralImages[41].length();
                                 System.out.println("WHILE -> " + image);
         break;
      case 42 :
        image.append(jjstrLiteralImages[42]);
        lengthOfMatch = jjstrLiteralImages[42].length();
                   System.out.println("DO -> " + image);
         break;
      case 43 :
        image.append(jjstrLiteralImages[43]);
        lengthOfMatch = jjstrLiteralImages[43].length();
                     System.out.println("FOR -> " + image);
         break;
      case 44 :
        image.append(jjstrLiteralImages[44]);
        lengthOfMatch = jjstrLiteralImages[44].length();
                         System.out.println("SEPARATOR -> " + image);
         break;
      case 45 :
        image.append(jjstrLiteralImages[45]);
        lengthOfMatch = jjstrLiteralImages[45].length();
                   System.out.println("IF -> " + image);
         break;
      case 46 :
        image.append(jjstrLiteralImages[46]);
        lengthOfMatch = jjstrLiteralImages[46].length();
                       System.out.println("ELSE -> " + image);
         break;
      case 47 :
        image.append(jjstrLiteralImages[47]);
        lengthOfMatch = jjstrLiteralImages[47].length();
                   System.out.println("OR -> " + image);
         break;
      case 48 :
        image.append(jjstrLiteralImages[48]);
        lengthOfMatch = jjstrLiteralImages[48].length();
                    System.out.println("AND -> " + image);
         break;
      case 49 :
        image.append(jjstrLiteralImages[49]);
        lengthOfMatch = jjstrLiteralImages[49].length();
                   System.out.println("NOT -> " + image);
         break;
      case 50 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                       System.out.println("Number -> " + image + "\u005cr\u005cn");
         break;
      case 51 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                        System.out.println("ID -> " + image + "\u005cr\u005cn");
         break;
      case 52 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                            System.out.println("DOUBLEQUOTED -> " + image + "\u005cr\u005cn");
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
