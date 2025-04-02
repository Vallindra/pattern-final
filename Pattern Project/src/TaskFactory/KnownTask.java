
package TaskFactory;

public class KnownTask implements Task {
        @Override
        public String getType() {
                return "Known task from previous years";
        }
}