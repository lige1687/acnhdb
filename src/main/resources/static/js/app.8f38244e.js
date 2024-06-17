(function(){"use strict";var t={9285:function(t,n,e){var l=e(5130),u=e(6768);const r={id:"app"};function o(t,n,e,l,o,i){const a=(0,u.g2)("HousewareTable");return(0,u.uX)(),(0,u.CE)("div",r,[(0,u.bF)(a)])}var i=e(4232);const a=t=>((0,u.Qi)("data-v-43e0ee8f"),t=t(),(0,u.jt)(),t),c=a((()=>(0,u.Lk)("h2",null,"Houseware Table",-1))),h=a((()=>(0,u.Lk)("thead",null,[(0,u.Lk)("tr",null,[(0,u.Lk)("th",null,"ID"),(0,u.Lk)("th",null,"Name"),(0,u.Lk)("th",null,"Variation"),(0,u.Lk)("th",null,"Body Title"),(0,u.Lk)("th",null,"Pattern"),(0,u.Lk)("th",null,"Pattern Title"),(0,u.Lk)("th",null,"DIY"),(0,u.Lk)("th",null,"Body Customize"),(0,u.Lk)("th",null,"Pattern Customize"),(0,u.Lk)("th",null,"Kit Cost"),(0,u.Lk)("th",null,"Buy Price"),(0,u.Lk)("th",null,"Sell Price"),(0,u.Lk)("th",null,"Miles Price"),(0,u.Lk)("th",null,"Color 1"),(0,u.Lk)("th",null,"Color 2"),(0,u.Lk)("th",null,"Size"),(0,u.Lk)("th",null,"Interact"),(0,u.Lk)("th",null,"Tag"),(0,u.Lk)("th",null,"Outdoor"),(0,u.Lk)("th",null,"Source"),(0,u.Lk)("th",null,"Source Notes"),(0,u.Lk)("th",null,"HHA Concept 1"),(0,u.Lk)("th",null,"HHA Concept 2"),(0,u.Lk)("th",null,"HHA Series"),(0,u.Lk)("th",null,"HHA Set"),(0,u.Lk)("th",null,"Speaker Type"),(0,u.Lk)("th",null,"Lighting Type")])],-1)));function d(t,n,e,l,r,o){return(0,u.uX)(),(0,u.CE)("div",null,[c,(0,u.Lk)("table",null,[h,(0,u.Lk)("tbody",null,[((0,u.uX)(!0),(0,u.CE)(u.FK,null,(0,u.pI)(r.housewares,(t=>((0,u.uX)(),(0,u.CE)("tr",{key:t.id},[(0,u.Lk)("td",null,(0,i.v_)(t.id),1),(0,u.Lk)("td",null,(0,i.v_)(t.name),1),(0,u.Lk)("td",null,(0,i.v_)(t.variation),1),(0,u.Lk)("td",null,(0,i.v_)(t.bodyTitle),1),(0,u.Lk)("td",null,(0,i.v_)(t.pattern),1),(0,u.Lk)("td",null,(0,i.v_)(t.patternTitle),1),(0,u.Lk)("td",null,(0,i.v_)(t.diy),1),(0,u.Lk)("td",null,(0,i.v_)(t.bodyCustomize),1),(0,u.Lk)("td",null,(0,i.v_)(t.patternCustomize),1),(0,u.Lk)("td",null,(0,i.v_)(t.kitCost),1),(0,u.Lk)("td",null,(0,i.v_)(t.buyPrice),1),(0,u.Lk)("td",null,(0,i.v_)(t.sellPrice),1),(0,u.Lk)("td",null,(0,i.v_)(t.milesPrice),1),(0,u.Lk)("td",null,(0,i.v_)(t.color_1),1),(0,u.Lk)("td",null,(0,i.v_)(t.color_2),1),(0,u.Lk)("td",null,(0,i.v_)(t.size),1),(0,u.Lk)("td",null,(0,i.v_)(t.interact),1),(0,u.Lk)("td",null,(0,i.v_)(t.tag),1),(0,u.Lk)("td",null,(0,i.v_)(t.outdoor),1),(0,u.Lk)("td",null,(0,i.v_)(t.source),1),(0,u.Lk)("td",null,(0,i.v_)(t.sourceNotes),1),(0,u.Lk)("td",null,(0,i.v_)(t.hhaConcept_1),1),(0,u.Lk)("td",null,(0,i.v_)(t.hhaConcept_2),1),(0,u.Lk)("td",null,(0,i.v_)(t.hhaSeries),1),(0,u.Lk)("td",null,(0,i.v_)(t.hhaSet),1),(0,u.Lk)("td",null,(0,i.v_)(t.speakerType),1),(0,u.Lk)("td",null,(0,i.v_)(t.lightingType),1)])))),128))])])])}var k=e(4373),s={data(){return{housewares:[]}},mounted(){this.fetchHousewares()},methods:{fetchHousewares(){k.A.get("http://localhost:8080/api/housewares").then((t=>{this.housewares=t.data})).catch((t=>{console.error("Error fetching housewares:",t)}))}}},L=e(1241);const v=(0,L.A)(s,[["render",d],["__scopeId","data-v-43e0ee8f"]]);var f=v,p={name:"App",components:{HousewareTable:f}};const _=(0,L.A)(p,[["render",o]]);var b=_;(0,l.Ef)(b).mount("#app")}},n={};function e(l){var u=n[l];if(void 0!==u)return u.exports;var r=n[l]={exports:{}};return t[l].call(r.exports,r,r.exports,e),r.exports}e.m=t,function(){var t=[];e.O=function(n,l,u,r){if(!l){var o=1/0;for(h=0;h<t.length;h++){l=t[h][0],u=t[h][1],r=t[h][2];for(var i=!0,a=0;a<l.length;a++)(!1&r||o>=r)&&Object.keys(e.O).every((function(t){return e.O[t](l[a])}))?l.splice(a--,1):(i=!1,r<o&&(o=r));if(i){t.splice(h--,1);var c=u();void 0!==c&&(n=c)}}return n}r=r||0;for(var h=t.length;h>0&&t[h-1][2]>r;h--)t[h]=t[h-1];t[h]=[l,u,r]}}(),function(){e.n=function(t){var n=t&&t.__esModule?function(){return t["default"]}:function(){return t};return e.d(n,{a:n}),n}}(),function(){e.d=function(t,n){for(var l in n)e.o(n,l)&&!e.o(t,l)&&Object.defineProperty(t,l,{enumerable:!0,get:n[l]})}}(),function(){e.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){e.o=function(t,n){return Object.prototype.hasOwnProperty.call(t,n)}}(),function(){e.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})}}(),function(){var t={524:0};e.O.j=function(n){return 0===t[n]};var n=function(n,l){var u,r,o=l[0],i=l[1],a=l[2],c=0;if(o.some((function(n){return 0!==t[n]}))){for(u in i)e.o(i,u)&&(e.m[u]=i[u]);if(a)var h=a(e)}for(n&&n(l);c<o.length;c++)r=o[c],e.o(t,r)&&t[r]&&t[r][0](),t[r]=0;return e.O(h)},l=self["webpackChunkacnhfront"]=self["webpackChunkacnhfront"]||[];l.forEach(n.bind(null,0)),l.push=n.bind(null,l.push.bind(l))}();var l=e.O(void 0,[504],(function(){return e(9285)}));l=e.O(l)})();
//# sourceMappingURL=app.8f38244e.js.map