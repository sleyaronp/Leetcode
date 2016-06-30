/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 
 public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new ArrayList<Interval>();
    
    for(Interval interval: intervals){
      if(interval.end < newInterval.start){
        result.add(newInterval);
      }
      else if(interval.start < newInterval.end){
        result.add(newInterval);
        newInterval = interval;
      }
      else if(interval.end > newInterval.start || interval.start < newInterval.end){
        int start = Math.min(interval.start, newInterval.start);
        int end = Math.max(interval.end, newInterval.end);
        newInterval = Interval(start,end);
      }
    }
    result.add(newInterval);
    return result;
  }
}
