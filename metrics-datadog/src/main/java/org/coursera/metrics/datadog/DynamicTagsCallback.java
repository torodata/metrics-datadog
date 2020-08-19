package org.coursera.metrics.datadog;

import java.util.List;

/**
 * An implementation of this interface can be used to pass a callback to the builder of
 * {@link org.coursera.metrics.datadog.DatadogReporter DatadogReporter}, so that DatadogReporter
 * can use dynamic tags
 */
public interface DynamicTagsCallback {
  /**
   * Allow generating tags from the metric name dynamically.
   * @param metricName is the metric name to generate dynamic tags from (if desired)
   * @param expansion this is a string that gets appended (joined with a period) to form the full
   *                  metric name.
   * @return dynamic tags that will merge into the static tags
   */
  public List<String> generateTagsFromMetricName(
      String metricName, String expansion);
}
