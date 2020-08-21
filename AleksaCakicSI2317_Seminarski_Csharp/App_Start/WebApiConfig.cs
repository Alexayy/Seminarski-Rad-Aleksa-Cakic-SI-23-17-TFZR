using System.Data.Entity.Core.Objects;
using System.Security.AccessControl;
using System.Web.Http;
using System.Web.Http.Cors;

namespace AleksaCakicSI2317_Seminarski
{
    public static class WebApiConfig
    {
        public static void Register(HttpConfiguration config)
        {
            // Web API configuration and services https://localhost:44309/
            config.EnableCors();
            // Web API routes
            config.MapHttpAttributeRoutes();

            config.Routes.MapHttpRoute(
                name: "DefaultApi",
                routeTemplate: "api/{controller}/{id}",
                defaults: new { id = RouteParameter.Optional }
            );
        }
    }
}
