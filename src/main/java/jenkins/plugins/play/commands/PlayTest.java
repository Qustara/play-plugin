package jenkins.plugins.play.commands;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;

/**
 * Represents the Play test command.
 */
public class PlayTest extends PlayCommand {
	
	@DataBoundConstructor
	public PlayTest() {
	}
	
	@Extension
    public static class DescriptorImpl extends PlayCommandDescriptor {
		
        @Override
        public String getDisplayName() {
            return "Execute all test cases [test]";
        }
        
        public String getCommandId() {
        	return "PLAY_TEST";
        }
        
        public String getCommand() {
        	return "test";
        }
	}
}
