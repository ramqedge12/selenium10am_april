


Run("Notepad.exe")

WinWaitActive("Untitled - Notepad")

ControlSend("Untitled - Notepad","","Edit1","hello ram how r u")

WinClose("Untitled - Notepad")

WinWaitActive("Notepad")

ControlClick("Notepad","","Button1")

WinWaitActive("Save As")

ControlFocus("Save As","","Edit1")

Send("D:\sushma.txt")


ControlClick("Save As","","Button1")