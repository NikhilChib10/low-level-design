package behavioural_design_patterns.command_pattern.commands;

import behavioural_design_patterns.command_pattern.editor.Editor;
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}