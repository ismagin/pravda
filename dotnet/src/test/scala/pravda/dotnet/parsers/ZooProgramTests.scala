package pravda.dotnet

package parsers

import pravda.common.DiffUtils
import pravda.dotnet.data.Method
import pravda.dotnet.data.TablesData._
import pravda.dotnet.parsers.CIL._
import utest._

object ZooProgramTests extends TestSuite {

  val tests = Tests {
    'zooProgramParse - {
      val Right((_, cilData, methods, signatures)) = parsePeFile("zoo_program.exe")

      DiffUtils.assertEqual(
        methods,
        List(
          Method(
            List(
              Nop,
              LdcI4S(10),
              NewArr(TypeRefData(6, "Byte", "System")),
              StLoc0,
              LdcI40,
              StLoc1,
              BrS(30),
              Nop,
              LdLoc0,
              LdLoc1,
              LdArg1,
              LdLoc1,
              LdArg1,
              CallVirt(MemberRefData(TypeRefData(6, "String", "System"), "get_Length", 25)),
              Rem,
              CallVirt(MemberRefData(TypeRefData(6, "String", "System"), "get_Chars", 29)),
              LdcI42,
              Div,
              Call(MemberRefData(TypeRefData(6, "Convert", "System"), "ToByte", 34)),
              StElemI1,
              Nop,
              LdLoc1,
              LdcI41,
              Add,
              StLoc1,
              LdLoc1,
              LdcI4S(10),
              Clt,
              StLoc2,
              LdLoc2,
              BrTrueS(-39),
              LdLoc0,
              NewObj(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), ".ctor", 39)),
              StLoc3,
              BrS(0),
              LdLoc3,
              Ret
            ),
            5,
            Some(16)
          ),
          Method(
            List(
              Nop,
              LdArg0,
              LdFld(FieldData(6, "ZooToOwner", 159)),
              LdArg0,
              LdFld(FieldData(6, "ZooCnt", 168)),
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              CallVirt(MemberRefData(TypeSpecData(54), "put", 62)),
              Nop,
              LdArg0,
              LdArg0,
              LdFld(FieldData(6, "ZooCnt", 168)),
              LdcI41,
              Add,
              StFld(FieldData(6, "ZooCnt", 168)),
              LdArg0,
              LdFld(FieldData(6, "ZooCnt", 168)),
              LdcI41,
              Sub,
              StLoc0,
              BrS(0),
              LdLoc0,
              Ret
            ),
            3,
            Some(45)
          ),
          Method(
            List(
              Nop,
              LdArg0,
              LdFld(FieldData(6, "ZooToOwner", 159)),
              LdArg2,
              LdSFld(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "EMPTY", 74)),
              CallVirt(MemberRefData(TypeSpecData(54), "getDefault", 78)),
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              Ceq,
              StLoc0,
              LdLoc0,
              BrFalseS(16),
              Nop,
              LdArg0,
              LdFld(FieldData(6, "ZooToOwner", 159)),
              LdArg2,
              LdArg1,
              CallVirt(MemberRefData(TypeSpecData(54), "put", 62)),
              Nop,
              Nop,
              Ret
            ),
            3,
            Some(70)
          ),
          Method(
            List(
              Nop,
              LdArg0,
              LdFld(FieldData(6, "ZooToOwner", 159)),
              LdArg1,
              LdSFld(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "EMPTY", 74)),
              CallVirt(MemberRefData(TypeSpecData(54), "getDefault", 78)),
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              Ceq,
              StLoc0,
              LdLoc0,
              BrFalseS(79),
              Nop,
              LdStr("pet"),
              LdArg0,
              LdFld(FieldData(6, "PetId", 168)),
              Call(MemberRefData(TypeRefData(6, "Convert", "System"), "ToString", 93)),
              Call(MemberRefData(TypeRefData(6, "String", "System"), "Concat", 98)),
              StLoc1,
              LdArg0,
              LdFld(FieldData(6, "PetToOwner", 150)),
              LdLoc1,
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              CallVirt(MemberRefData(TypeSpecData(104), "put", 62)),
              Nop,
              LdArg0,
              LdFld(FieldData(6, "PetSignature", 150)),
              LdLoc1,
              LdArg0,
              LdLoc1,
              Call(MethodDefData(0, 0, 129, "GenerateSignature", 171, Vector(ParamData(0, 1, "pet")))),
              CallVirt(MemberRefData(TypeSpecData(104), "put", 62)),
              Nop,
              LdArg0,
              LdArg0,
              LdFld(FieldData(6, "PetId", 168)),
              LdcI41,
              Add,
              StFld(FieldData(6, "PetId", 168)),
              LdLoc1,
              StLoc2,
              BrS(8),
              LdStr(""),
              StLoc2,
              BrS(0),
              LdLoc2,
              Ret
            ),
            4,
            Some(87)
          ),
          Method(
            List(
              Nop,
              LdArg0,
              LdFld(FieldData(6, "PetToOwner", 150)),
              LdArg3,
              LdSFld(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "EMPTY", 74)),
              CallVirt(MemberRefData(TypeSpecData(104), "getDefault", 78)),
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              BneUnS(22),
              LdArg0,
              LdFld(FieldData(6, "ZooToOwner", 159)),
              LdArg2,
              LdSFld(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "EMPTY", 74)),
              CallVirt(MemberRefData(TypeSpecData(54), "getDefault", 78)),
              LdArg1,
              Ceq,
              BrS(1),
              LdcI40,
              StLoc0,
              LdLoc0,
              BrFalseS(30),
              Nop,
              LdArg0,
              LdFld(FieldData(6, "PetToOwner", 150)),
              LdArg3,
              LdArg1,
              CallVirt(MemberRefData(TypeSpecData(104), "put", 62)),
              Nop,
              LdArg0,
              LdFld(FieldData(6, "PetToZoo", 142)),
              LdArg3,
              LdArg2,
              CallVirt(MemberRefData(TypeSpecData(112), "put", 62)),
              Nop,
              Nop,
              Ret
            ),
            3,
            Some(70)
          ),
          Method(
            List(
              Nop,
              LdArg0,
              LdFld(FieldData(6, "PetToOwner", 150)),
              LdArg1,
              LdSFld(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "EMPTY", 74)),
              CallVirt(MemberRefData(TypeSpecData(104), "getDefault", 78)),
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              BneUnS(54),
              LdArg0,
              LdFld(FieldData(6, "PetToOwner", 150)),
              LdArg2,
              LdSFld(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "EMPTY", 74)),
              CallVirt(MemberRefData(TypeSpecData(104), "getDefault", 78)),
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              BneUnS(30),
              LdArg0,
              LdFld(FieldData(6, "PetToZoo", 142)),
              LdArg1,
              LdcI4M1,
              CallVirt(MemberRefData(TypeSpecData(112), "getDefault", 78)),
              LdArg0,
              LdFld(FieldData(6, "PetToZoo", 142)),
              LdArg2,
              LdcI4M1,
              CallVirt(MemberRefData(TypeSpecData(112), "getDefault", 78)),
              Ceq,
              BrS(1),
              LdcI40,
              StLoc0,
              LdLoc0,
              BrFalseS(73),
              Nop,
              LdArg1,
              LdArg2,
              Call(MemberRefData(TypeRefData(6, "String", "System"), "Concat", 98)),
              StLoc1,
              LdArg0,
              LdFld(FieldData(6, "PetToOwner", 150)),
              LdLoc1,
              Call(MemberRefData(TypeRefData(10, "Info", "Expload.Pravda"), "Sender", 49)),
              CallVirt(MemberRefData(TypeSpecData(104), "put", 62)),
              Nop,
              LdArg0,
              LdFld(FieldData(6, "PetSignature", 150)),
              LdLoc1,
              LdArg0,
              LdFld(FieldData(6, "PetSignature", 150)),
              LdArg1,
              CallVirt(MemberRefData(TypeSpecData(104), "get", 119)),
              LdArg0,
              LdFld(FieldData(6, "PetSignature", 150)),
              LdArg2,
              CallVirt(MemberRefData(TypeSpecData(104), "get", 119)),
              CallVirt(MemberRefData(TypeRefData(10, "Bytes", "Expload.Pravda"), "Concat", 126)),
              CallVirt(MemberRefData(TypeSpecData(104), "put", 62)),
              Nop,
              LdLoc1,
              StLoc2,
              BrS(9),
              Nop,
              LdStr(""),
              StLoc2,
              BrS(0),
              LdLoc2,
              Ret
            ),
            5,
            Some(87)
          ),
          Method(List(Nop, Ret), 0, None),
          Method(
            List(
              LdArg0,
              NewObj(MemberRefData(TypeSpecData(112), ".ctor", 6)),
              StFld(FieldData(6, "PetToZoo", 142)),
              LdArg0,
              NewObj(MemberRefData(TypeSpecData(104), ".ctor", 6)),
              StFld(FieldData(6, "PetSignature", 150)),
              LdArg0,
              NewObj(MemberRefData(TypeSpecData(104), ".ctor", 6)),
              StFld(FieldData(6, "PetToOwner", 150)),
              LdArg0,
              NewObj(MemberRefData(TypeSpecData(54), ".ctor", 6)),
              StFld(FieldData(6, "ZooToOwner", 159)),
              LdArg0,
              LdcI41,
              StFld(FieldData(6, "ZooCnt", 168)),
              LdArg0,
              LdcI41,
              StFld(FieldData(6, "PetId", 168)),
              LdArg0,
              Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)),
              Nop,
              Ret
            ),
            2,
            None
          )
        )
      )
    }
  }
}
