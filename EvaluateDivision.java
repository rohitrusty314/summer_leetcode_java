import java.util.*;

class EvaluateDivision {
	public static void main(String[] args) {
		EvaluateDivision e = new EvaluateDivision();
		String[][] equations = {{"a", "b"}, {"b", "c"}};
		double[] values = {2.0, 3.0};
		String[][] queries = {{ "a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
		double[] result = e.calcEquation(equations, values, queries);

		for(double r : result)
			System.out.println(r + " ");

	}

	public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		Map<String, List<String>> pairs = new HashMap<String, List<String>>();
		Map<String, List<Double>> weights = new HashMap<String, List<Double>>();

		//Create the graph
		for(int i=0;i < equations.length;i++) {
			String[] eq = equations[i];

			if(!pairs.containsKey(eq[0])) {
				pairs.put(eq[0], new ArrayList<String>());
				weights.put(eq[0], new ArrayList<Double>());
			}

			if(!pairs.containsKey(eq[1])) {
				pairs.put(eq[1], new ArrayList<String>());
				weights.put(eq[1], new ArrayList<Double>());
			}

			pairs.get(eq[0]).add(eq[1]);
			pairs.get(eq[1]).add(eq[0]);
			weights.get(eq[0]).add(values[i]);
			weights.get(eq[1]).add(1/values[i]);

		}

		//Use dfs searching to find results of the queries
		double[] result = new double[queries.length];
		for(int i=0; i < queries.length;i++) {
			String[] q = queries[i];
			result[i] = dfs(q[0], q[1], pairs, weights, new HashSet<String>(), 1.0);
			if(result[i] == 0.0) result[i] = -1.0;
		}

		return result;

	}

	//Inputs: a start location, an end location, paths, and weights, set of visited, and current value
	private double dfs(String start, String end, Map<String, List<String>> pairs, Map<String, List<Double>> values, Set<String> visited, double value) {
		if(visited.contains(start)) return 0.0;
		if(!pairs.containsKey(start)) return 0.0;
		if(start.equals(end)) return value;

		visited.add(start);
		List<String> next = pairs.get(start);
		List<Double> curValue = values.get(start);
		double tempValue = 0.0;
		for(int i=0;i<next.size();i++) {
			tempValue = dfs(next.get(i), end, pairs, values, visited, value*curValue.get(i));
			if(tempValue != 0.0) break;
		}

		return tempValue;
	}

}