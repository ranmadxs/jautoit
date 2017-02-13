#include <Array.au3>
#include <WinAPIShPath.au3>
#include <MsgBoxConstants.au3>
#include <StringConstants.au3>
;MsgBox(0, "getControlText", $className)

Local $aCmdLine = _WinAPI_CommandLineToArgv($CmdLineRaw)
Local $className = String ($CmdLine[1])
Local $strTxt = String ($CmdLine[3])
$className = "[CLASS:" & $className & "]"
$controlId = Int ($CmdLine[2])
Local $hWnd = WinWait($className, "", 1)
Local $sText
$controlId = Int ($CmdLine[2])
If $controlId > 0 Then
   ControlSetText($hWnd, "", $controlId, $strTxt)
Else
   Local $varStr = String($CmdLine[2])
   ControlSetText($hWnd, "", $varStr, $strTxt)
EndIf