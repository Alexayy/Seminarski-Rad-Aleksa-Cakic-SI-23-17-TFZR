using System.Web;
using System.Web.Mvc;

namespace AleksaCakicSI2317_Seminarski
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
