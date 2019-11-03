package java0702.logger;

public class Test {
	public static void main(String[] args) {
		LoggerProcessor logger = new LoggerProcessor();
		logger.addChain(new ConsoleErrLogChain());
		logger.addChain(new TextFileLogChain());
//		LoggerProcessor logger = new LoggerProcessor(new ConsoleErrLogChain(),new TextFileLogChain());
		logger.processor("≤‚ ‘–≈œ¢");
		
	}
}
